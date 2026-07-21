import "./App.css";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
      <div className="container">
        {showBooks && <BookDetails />}
        {showBlogs && <BlogDetails />}
        {showCourses && <CourseDetails />}
      </div>
  );
}

export default App;