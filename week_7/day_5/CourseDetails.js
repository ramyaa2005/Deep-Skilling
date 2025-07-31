import React from "react";

function CourseDetails(props) {
  const coursedet = (
    <ul>
      {props.courses.map((course, index) => (
        <div key={index}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
}

export default CourseDetails;
