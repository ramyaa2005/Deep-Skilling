import React, { useContext } from "react";
import ThemeContext from "../ThemeContext";

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  const buttonClass = theme === "dark" ? "btn-dark" : "btn-light";

  return (
    <div style={{ border: "1px solid gray", padding: "10px", margin: "10px" }}>
      <h3>{employee.name}</h3>
      <p>{employee.designation}</p>
      <button className={buttonClass}>View</button>
    </div>
  );
}

export default EmployeeCard;
