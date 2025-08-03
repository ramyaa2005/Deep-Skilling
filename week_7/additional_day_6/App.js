
import React, { useState } from "react";
import ThemeContext from "./ThemeContext";
import EmployeeList from "./components/EmployeeList"; 
import './App.css'; 

function App() {
  const [theme, setTheme] = useState("light"); 

  return (
    <ThemeContext.Provider value={theme}>
      <div>
        <h1>Employee Management App</h1>
        <button onClick={() => setTheme(theme === "light" ? "dark" : "light")}>
          Toggle Theme
        </button>
        <p>Current Theme: {theme}</p>
        <EmployeeList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
