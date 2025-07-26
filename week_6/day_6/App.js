import React, { useState } from 'react';
import FileForm from './components/FileForm';
import FileList from './components/FileList';

function App() {
  const [files, setFiles] = useState([]);

  const addFile = (fileName) => {
    if (!files.includes(fileName.trim())) {
      setFiles([...files, fileName.trim()]);
      return true;
    }
    return false;
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>📁 File Creator App</h1>
      <FileForm addFile={addFile} />
      <FileList files={files} />
    </div>
  );
}

export default App;
