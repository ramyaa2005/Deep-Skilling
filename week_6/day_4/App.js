// src/App.js

import React, { useState } from 'react';
import Welcome from './components/Welcome';

function App() {
  const [count, setCount] = useState(0);

  const handleClick = () => {
    setCount(prevCount => prevCount + 1);
  };

  return (
    <div style={styles.container}>
      <h1>React Hands-on Lab</h1>
      <Welcome name="Nathish" />
      <p>You clicked the button <strong>{count}</strong> times.</p>
      <button style={styles.button} onClick={handleClick}>
        Click Me
      </button>
    </div>
  );
}

const styles = {
  container: {
    textAlign: 'center',
    padding: '50px',
    fontFamily: 'Arial, sans-serif',
  },
  button: {
    padding: '10px 20px',
    fontSize: '16px',
    backgroundColor: '#61dafb',
    border: 'none',
    borderRadius: '8px',
    cursor: 'pointer',
  }
};

export default App;
