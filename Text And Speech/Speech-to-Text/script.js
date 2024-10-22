window.SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;

const recognition = new SpeechRecognition();
recognition.interimResults = true;

document.querySelector('#eng').addEventListener('click', () => {
    recognition.lang = 'en-in';
    console.log('Language Selected: English');
});

document.querySelector('#hi').addEventListener('click', () => {
    recognition.lang = 'hi';
    console.log('Language Selected: Hindi');
});

let p = document.createElement('p');
const words = document.querySelector('.words');
words.appendChild(p);

recognition.addEventListener('result', e => {
    const transcript = Array.from(e.results)
        .map(result => result[0].transcript)
        .join('');

    p.textContent = transcript.replace(/poop|poo|shit|dump/gi, '💩');

    if (e.results[0].isFinal) {
        p = document.createElement('p');
        words.appendChild(p);
    }
});

recognition.start();
recognition.addEventListener('end', recognition.start);

document.querySelector('#start').addEventListener('click', () => {
    recognition.start();
    console.log('Speech recognition has started.');
});

document.querySelector('#stop').addEventListener('click', () => {
    recognition.stop();
    console.log('Speech recognition has stopped.');
});
