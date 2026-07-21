function BookDetails() {
    const books = [
        {
            id: 1,
            title: "React Basics",
            author: "Kundana",
            price: 550
        },
        {
            id: 2,
            title: "Java Programming",
            author: "James",
            price: 700
        }
    ];

    return (
        <div>
            <h2>Book Details</h2>

            {books.map((book) => (
                <div key={book.id}>
                    <p><b>Title:</b> {book.title}</p>
                    <p><b>Author:</b> {book.author}</p>
                    <p><b>Price:</b> ₹{book.price}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default BookDetails;