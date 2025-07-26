import React, { useState } from 'react';

function FileForm({ addFile }) {
  const [fileName, setFileName] = useState('');
  const [error, setError] = useState('');

  const handleSubmit = () => {
    if (fileName.trim() === '') {
      setError('⚠️ Please enter a file name.');
    } else if (!addFile(fileName)) {
      setError('⚠️ File name already exists!');
    } else {
      setError('');
    }
    setFileName('');
  };

  return (
    <div>
      <input
        type="text"
        placeholder="Enter file name"
        value={fileName}
        onChange={(e) => setFileName(e.target.value)}
      />
      <button onClick={handleSubmit} style={{ marginLeft: '10px' }}>
        Create File
      </button>
      {error && <p style={{ color: 'red' }}>{error}</p>}
    </div>
  );
}

export default FileForm;
