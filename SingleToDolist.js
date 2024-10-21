import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function App() {
  const [task, setTask] = useState(''); // Task input state
  const [tasks, setTasks] = useState([]); // Tasks array state

  // Add a new task
  const addTask = () => {
    if (task.trim()) {
      setTasks([...tasks, { text: task, isCompleted: false }]);
      setTask(''); // Clear input field
    }
  };

  // Toggle task completion
  const toggleTaskCompletion = (index) => {
    const newTasks = [...tasks];
    newTasks[index].isCompleted = !newTasks[index].isCompleted;
    setTasks(newTasks);
  };

  // Delete a task
  const deleteTask = (index) => {
    const newTasks = [...tasks];
    newTasks.splice(index, 1);
    setTasks(newTasks);
  };

  return (
    <div className="app">
      <h1>To-Do List</h1>
      <div className="task-input">
        <input 
          type="text" 
          placeholder="Enter a task" 
          value={task} 
          onChange={(e) => setTask(e.target.value)} 
        />
        <button onClick={addTask}>Add Task</button>
      </div>
      <div className="task-list">
        {tasks.map((task, index) => (
          <div key={index} className="task-item">
            <span
              style={{ textDecoration: task.isCompleted ? 'line-through' : '' }}
              onClick={() => toggleTaskCompletion(index)}
            >
              {task.text}
            </span>
            <button onClick={() => deleteTask(index)}>&times;</button>
          </div>
        ))}
      </div>
    </div>
  );
}

// CSS Styling in JS
const style = `
  body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f9;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
  }

  .app {
    text-align: center;
    max-width: 400px;
    margin: 50px auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
  }

  h1 {
    color: #333;
  }

  .task-input {
    display: flex;
    justify-content: center;
    margin-bottom: 20px;
  }

  input {
    padding: 10px;
    width: 250px;
    font-size: 16px;
    border: 2px solid #007bff;
    border-radius: 5px;
    margin-right: 10px;
  }

  button {
    padding: 10px;
    font-size: 16px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }

  button:hover {
    background-color: #0056b3;
  }

  .task-list {
    text-align: left;
  }

  .task-item {
    display: flex;
    justify-content: space-between;
    background-color: #f4f4f4;
    padding: 10px;
    margin-bottom: 10px;
    border-radius: 5px;
    cursor: pointer;
  }

  .task-item span {
    flex: 1;
  }

  .task-item button {
    background-color: transparent;
    color: red;
    font-size: 18px;
    border: none;
    cursor: pointer;
  }

  .task-item button:hover {
    color: darkred;
  }
`;

// Append styles to the document head
const styleSheet = document.createElement('style');
styleSheet.type = 'text/css';
styleSheet.innerText = style;
document.head.appendChild(styleSheet);

ReactDOM.render(<App />, document.getElementById('root'));
