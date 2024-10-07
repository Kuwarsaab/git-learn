import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import 'regenerator-runtime/runtime'; // Add this line to fix the error
import App from './App.jsx';
import './index.css';

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
  </StrictMode>,
);
