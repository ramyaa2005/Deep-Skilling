import React, { useState } from 'react';
import CounterDisplay from './components/CounterDisplay';
import CounterControls from './components/CounterControls';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => setCount(count + 1);
  const decrement = () => setCount(count - 1);
  const reset = () => setCount(0);

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h1>🧮 Counter App</h1>
      <CounterDisplay count={count} />
      <CounterControls increment={increment} decrement={decrement} reset={reset} />
    </div>
  );
}

export default App;
