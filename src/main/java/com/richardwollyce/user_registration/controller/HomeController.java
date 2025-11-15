package com.richardwollyce.user_registration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <html>
                <head>
                    <title>User Registration API</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            background-color: #f4f4f9;
                            color: #333;
                            margin: 0;
                            padding: 0;
                        }
                        .container {
                            width: 90%;
                            max-width: 900px;
                            margin: auto;
                            padding: 30px;
                        }
                        h1 {
                            font-size: 32px;
                            margin-bottom: 10px;
                        }
                        h3 {
                            margin-top: 30px;
                            font-size: 22px;
                        }
                        table {
                            border-collapse: collapse;
                            width: 100%;
                            margin-top: 20px;
                        }
                        th, td {
                            border: 1px solid #ccc;
                            padding: 10px;
                            text-align: left;
                        }
                        th {
                            background-color: #e6e6e6;
                        }
                        footer {
                            margin-top: 40px;
                            font-size: 14px;
                            text-align: center;
                            opacity: 0.75;
                        }
                        a {
                            color: #0056b3;
                            text-decoration: none;
                        }
                        a:hover {
                            text-decoration: underline;
                        }
                    </style>
                </head>

                <body>
                    <div class="container">
                        <h1>API is running! 🚀</h1>
                        <p>Welcome to the User Registration API. Below you can find the available endpoints.</p>

                        <h3>Available Endpoints</h3>

                        <table>
                            <tr><th>Method</th><th>Endpoint</th><th>Description</th></tr>
                            <tr><td>POST</td><td>/users</td><td>Create a new user</td></tr>
                            <tr><td>GET</td><td>/users/{id}</td><td>Retrieve a user by ID</td></tr>
                            <tr><td>GET</td><td>/users?email=value</td><td>Filter user by email</td></tr>
                            <tr><td>PUT</td><td>/users/{id}</td><td>Update a user by ID</td></tr>
                            <tr><td>DELETE</td><td>/users/{id}</td><td>Delete a user by ID</td></tr>
                        </table>

                        <footer>
                            Developed by <strong>Richard Wollyce</strong><br>
                            <a href="https://github.com/richard-wollyce" target="_blank">GitHub</a> |
                            <a href="https://www.linkedin.com/in/richardwollyce-/" target="_blank">LinkedIn</a> |
                            <a href="https://www.richardwollyce.com" target="_blank">Website</a>
                        </footer>
                    </div>
                </body>
                </html>
                """;
    }
}
