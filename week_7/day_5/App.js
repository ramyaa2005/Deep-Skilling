import React from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";
import './App.css';

export const books = [
  { id: 101, bname: "Master React", price: 670 },
  { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
  { id: 103, bname: "Mongo Essentials", price: 450 },
];

const blogs = [
  {
    title: "React Learning",
    author: "Stephen Biz",
    content: "Welcome to learning React!",
  },
  {
    title: "Installation",
    author: "Schewzdenier",
    content: "You can install React from npm.",
  },
];

const courses = [
  { cname: "Angular", date: "4/5/2021" },
  { cname: "React", date: "6/3/20201" },
];

function App() {
  return (
    <div style={{ display: "flex", justifyContent: "space-around", padding: 20 }}>
      <CourseDetails courses={courses} />
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} />
    </div>
  );
}

export default App;
