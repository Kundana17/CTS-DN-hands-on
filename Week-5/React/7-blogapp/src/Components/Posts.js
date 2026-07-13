import React, { Component } from "react";

class Posts extends Component {

    constructor() {
        super();

        this.state = {
            posts: []
        };
    }

    componentDidMount() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                this.setState({
                    posts: data.slice(0, 10)
                });
            })
            .catch(error => console.log(error));
    }

    render() {

        return (
            <div style={{ padding: "20px" }}>

                <h2>Blog Posts</h2>

                {
                    this.state.posts.map(post => (

                        <div
                            key={post.id}
                            style={{
                                border: "1px solid gray",
                                marginBottom: "15px",
                                padding: "10px"
                            }}
                        >
                            <h3>{post.title}</h3>

                            <p>{post.body}</p>

                        </div>

                    ))
                }

            </div>
        );

    }

}

export default Posts;