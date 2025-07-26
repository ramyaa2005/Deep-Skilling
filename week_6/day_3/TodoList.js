import React from 'react';

function TodoList({ todos, onToggle, onDelete }) {
  return (
    <ul>
      {todos.map((todo, index) => (
        <li key={index} style={{ textDecoration: todo.completed ? 'line-through' : 'none' }}>
          {todo.text}
          <button onClick={() => onToggle(index)}>
            {todo.completed ? 'Undo' : 'Complete'}
          </button>
          <button onClick={() => onDelete(index)}>Delete</button>
        </li>
      ))}
    </ul>
  );
}

export default TodoList;
