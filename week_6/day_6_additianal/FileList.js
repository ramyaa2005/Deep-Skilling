import React from 'react';

function FileList({ files }) {
  return (
    <div style={{ marginTop: '20px' }}>
      <h3>📄 Created Files</h3>
      <ul>
        {files.map((file, idx) => (
          <li key={idx}>{file}</li>
        ))}
      </ul>
    </div>
  );
}

export default FileList;
    