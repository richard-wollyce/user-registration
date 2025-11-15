# User Registration API – Spring Boot

![CI](https://github.com/richard-wollyce/user-registration/actions/workflows/ci.yml/badge.svg)
![CD](https://github.com/richard-wollyce/user-registration/actions/workflows/cd.yml/badge.svg)

A simple **RESTful API** for user registration and management, built with **Spring Boot**, **Java 25**, and an **in-memory H2 database**.

The API allows you to create, read, update, and delete users through standard HTTP requests, following a **clean layered architecture**.

-----

## Features

* **Create** new users.
* **Retrieve** users by ID or email.
* **Update** users by ID.
* **Delete** users by ID.
* Organized into layers: **Controller** → **Service** → **Repository** → **Entity**.

-----

## Project Structure

```
com.richardwollyce.user_registration
├── business                → Business logic (UserService)
├── controller              → REST endpoints (HomeController; UserController)
├── infrastructure
│   ├── entities            → JPA entity (User)
│   └── repository          → Persistence layer (UserRepository)
└── UserRegistrationApplication → Main application
```

-----

## Tech Stack

| Category              | Technology            |
|:----------------------|:----------------------|
| Language              | **Java 25**           |
| Framework             | **Spring Boot 3.5.7** |
| Database (dev)        | **H2 (in-memory)**    |
| Database (prod)       | **MariaDB MySQL**     |
| ORM                   | **Spring Data JPA**   |
| Dependency Management | **Maven**             |
| Utilities             | **Lombok**            |

-----

## API Endpoints

| Method     | Endpoint             | Description              |
|:-----------|:---------------------|:-------------------------|
| **POST**   | `/users`             | Create a new user        |
| **GET**    | `/users/{id}`        | Retrieve a user by ID    |
| **GET**    | `/users?email=value` | Retrieve a user by email |
| **PUT**    | `/users/{id}`        | Update a user by ID      |
| **DELETE** | `/users/{id}`        | Delete a user by email   |

-----

## Running the Project

### Clone the Repository

```bash
git clone https://github.com/richardwollyce/user-registration.git
cd user-registration
```

### Run the Application

```bash
mvn spring-boot:run
```

### Access in Your Browser

* **API:** `http://localhost:8080`
* **H2 Console:** `http://localhost:8080/h2-console`
    * **JDBC URL:** `jdbc:h2:mem:users`
    * **User:** *(choose your username)*
    * **Password:** *(use a strong password here)*

-----

## Usage Examples

Base URL:
```
http://localhost:8080/users
```

---

### 🔹 Create a User (`POST /users`)

**Request body**
```json
{
  "name": "Richard",
  "email": "mail@richardwollyce.com"
}
```

**Success response**  
`201 Created`
```json
{
  "message": "User successfully registered!",
  "data": {
    "id": 1,
    "name": "Richard",
    "email": "mail@richardwollyce.com"
  }
}
```

**Error response**  
`400 Bad Request`
```json
{
  "message": "User registration failed!"
}
```

---

### 🔹 Get a User by ID (`GET /users/1`)

**Success response**  
`200 OK`
```json
{
  "message": "User found successfully!",
  "data": {
    "id": 1,
    "name": "Richard",
    "email": "mail@richardwollyce.com"
  }
}
```

**Error response**  
`404 Not Found`
```json
{
  "message": "Search failed: User not found!"
}
```
**Optional filter by Email**
```
GET /users?email=mail@richardwollyce.com
```
---

### 🔹 Update a User by ID (`PUT /users/1`)

**Request body**
```json
{
  "name": "Richard Wollyce"
}
```

**Success response**  
`200 OK`
```json
{
  "message": "User successfully updated!",
  "data": {
    "id": 1,
    "name": "Richard Wollyce",
    "email": "mail@richardwollyce.com"
  }
}
```

**Error response**  
`404 Not Found`
```json
{
  "message": "Update failed: User not found!"
}
```

---

### 🔹 Delete a User by Email (`DELETE /users/1`)

**Success response**  
`200 OK`
```json
{
  "message": "User successfully deleted!"
}
```

**Error response**  
`404 Not Found`
```json
{
  "message": "Delete failed: User not found!"
}
```

-----

## Author & License

**Author:** Richard Wollyce

**Links:**

* [LinkedIn](https://www.linkedin.com/in/richardwollyce-/)
* [YouTube](https://www.youtube.com/@richardwollyce)
* [Website](https://www.richardwollyce.com)

**License:** This project is licensed under the **MIT License**.

-----
