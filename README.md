# User Registration API – Spring Boot

A simple **RESTful API** for user registration and management, built with **Spring Boot**, **Java 25**, and an **in-memory H2 database**.

The API allows you to create, read, update, and delete users through standard HTTP requests, following a **clean layered architecture**.

-----

## Features

* **Create** new users.
* **Retrieve** users by email.
* **Update** users by ID.
* **Delete** users by email.
* Organized into layers: **Controller** → **Service** → **Repository** → **Entity**.

-----

## Project Structure

```
com.richardwollyce.cadastro_usuario
├── business                → Business logic (UsuarioService)
├── controller              → REST endpoints (UsuarioController)
├── infrastructure
│   ├── entities            → JPA entity (Usuario)
│   └── repository          → Persistence layer (UsuarioRepository)
└── CadastroUsuarioApplication → Main application
```

-----

## Tech Stack

| Category | Technology |
| :--- | :--- |
| Language | **Java 25** |
| Framework | **Spring Boot 3.5.7** |
| Database | **H2 (in-memory)** |
| ORM | **Spring Data JPA** |
| Dependency Management | **Maven** |
| Utilities | **Lombok** |

-----

## API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/usuario` | Create a new user |
| **GET** | `/usuario?email=value` | Retrieve a user by email |
| **PUT** | `/usuario?id=value` | Update a user by ID |
| **DELETE** | `/usuario?email=value` | Delete a user by email |

-----

## 💻 Running the Project

### Clone the Repository

```bash
git clone https://github.com/richardwollyce/cadastro-usuario.git
cd cadastro-usuario
```

### Run the Application

```bash
mvn spring-boot:run
```

### Access in Your Browser

* **API:** `http://localhost:8080`
* **H2 Console:** `http://localhost:8080/h2-console`
    * **JDBC URL:** `jdbc:h2:mem:usuario`
    * **User:** `richard`
    * **Password:** *(leave blank)*

-----

## 📦 Example Requests

### Create a User (`POST /usuario`)

```json
{
"nome": "Richard",
"email": "mail@richardwollyce.com"
}
```

### Update a User (`PUT /usuario?id=1`)

```json
{
"nome": "Richard"
}
```

### Get a User by Email (`GET /usuario?email=mail@richardwollyce.com`)

**Response:**

```json
{
"id": 1,
"nome": "Richard",
"email": "mail@richardwollyce.com"
}
```

-----

## 🧑‍💻 Author & License

**Author:** Richard Wollyce Santos de Souza

**Links:**

* [🌐 Website]
* [💼 LinkedIn]
* [💻 GitHub]

**License:** This project is licensed under the **MIT License**.

-----