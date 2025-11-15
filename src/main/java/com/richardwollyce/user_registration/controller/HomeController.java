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
            <title>API Running</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                }
                h1 {
                    font-size: 28px;
                }
                .endpoints-container {
                    display: flex;
                    align-items: flex-start;
                    gap: 20px;
                    margin-top: 20px;
                }
                table {
                    border-collapse: collapse;
                    width: 430px;
                }
                th, td {
                    border: 1px solid black;
                    padding: 8px;
                    text-align: left;
                }
                th {
                    background-color: #f2f2f2;
                }
                .example-box {
                    width: 430px;
                }
                img {
                    width: 100%;
                    max-width: 430px;
                    border: 1px solid #444;
                    border-radius: 5px;
                }
            </style>
        </head>
        <body>
            <h1>API is running! 🚀</h1>

            <h3>Available Endpoints</h3>

            <div class="endpoints-container">
                <table>
                    <tr><th>Method</th><th>Endpoint</th><th>Description</th></tr>
                    <tr><td>POST</td><td>/users</td><td>Create a new user</td></tr>
                    <tr><td>GET</td><td>/users?email=value</td><td>Retrieve a user by email</td></tr>
                    <tr><td>PUT</td><td>/users?id=value</td><td>Update a user by ID</td></tr>
                    <tr><td>DELETE</td><td>/users?email=value</td><td>Delete a user by email</td></tr>
                </table>

                <!-- img right side -->
                <div class="example-box">
                    <img src="/img/examplerequests.webp" alt="API Examples">
                </div>
            </div>

            <p style="margin-top: 20px;">
                Use Postman or a REST client for POST & PUT requests.
            </p>
        </body>
        </html>
        """;
    }
}
