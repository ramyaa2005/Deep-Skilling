import React from "react";

function BlogDetails(props) {
  const content = (
    <ul>
      {props.blogs.map((blog, index) => (
        <div key={index}>
          <h3>{blog.title}</h3>
          <strong>{blog.author}</strong>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

export default BlogDetails;
