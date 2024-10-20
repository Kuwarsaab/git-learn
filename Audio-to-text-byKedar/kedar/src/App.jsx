import { useState } from 'react';
import SpeechRecognition, { useSpeechRecognition } from 'react-speech-recognition';
import './App.css';
import './style.css';

function App() {
  const [useAudio, setUseAudio] = useState(false);
  const { transcript, browserSupportsSpeechRecognition } = useSpeechRecognition();

  const startListening = () => {
    setUseAudio(true);
    SpeechRecognition.startListening({ continuous: true, language: 'en-IN' });
  };

  const stopListening = () => {
    setUseAudio(false);
    SpeechRecognition.stopListening();
  };

  if (!browserSupportsSpeechRecognition) {
    return <p>Your browser does not support speech recognition.</p>;
  }

  return (
    <>
      <div className="audio-feature">
        <h2 style={{ fontSize: "2rem", color: "green", textAlign: "center" }}>Audio to Text</h2>
        <p style={{ color: "gray", textAlign: "center" }}>Click the mic to start speaking</p>

        <div className="mic-icon-container">
          <button
            className="mic-button"
            onClick={startListening}
            disabled={useAudio}
          >
            🎤 Start Recording
          </button>

          <button
            className="mic-button"
            onClick={stopListening}
            disabled={!useAudio}
          >
            🛑 Stop Recording
          </button>
        </div>

        {/* Displaying the transcribed text below the buttons */}
        <div style={{ color: "black", fontSize: "1.5rem", textAlign: "center", marginTop: "20px" }} className="transcript">
          {useAudio ? transcript : ""}
        </div>
      </div>
    </>
  );
}

export default App;
