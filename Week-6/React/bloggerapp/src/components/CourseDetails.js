function CourseDetails() {
    const courses = [
        {
            id: 1,
            name: "React",
            duration: "2 Months"
        },
        {
            id: 2,
            name: "Spring Boot",
            duration: "3 Months"
        }
    ];

    return (
        <div>
            <h2>Course Details</h2>

            {courses.map((course) => (
                <div key={course.id}>
                    <p><b>Course:</b> {course.name}</p>
                    <p><b>Duration:</b> {course.duration}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default CourseDetails;