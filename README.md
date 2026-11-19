# Student CRUD API

My first Spring Boot REST API project, built while following a tutorial and practicing backend development.

The application manages student records stored in MySQL.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman for API testing
- DBeaver for viewing database records

## Features

- Create a student
- Get a student by ID
- Get all students
- Update a student
- Delete a student

## API Endpoints

Base URL: `http://localhost:8081`

| Method | Endpoint | Purpose |
|--------|----------|---------|
| POST | `/api/students` | Create a student |
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get one student |
| PUT | `/api/students/{id}` | Update a student |
| DELETE | `/api/students/{id}` | Delete a student |

## Student JSON Example

```json
{
  "name": "Alex Rivera",
  "email": "alex@example.com",
  "age": 16,
  "grade": "11th"
}
```

Use `Content-Type: application/json` when sending JSON requests.

## Run Locally

1. Install a JDK compatible with the project's Spring Boot version and start MySQL.
2. Clone or download this repository.
3. Create the database:

   ```sql
   CREATE DATABASE student_curd_db;
   ```

4. Check the database URL and username in
   `src/main/resources/application.properties`.
5. Set the `DB_PASSWORD` environment variable to your MySQL password.
   In IntelliJ, add it under Run → Edit Configurations → Environment variables.
6. Run `CurdSpringBootApplication` from IntelliJ.

The API runs at `http://localhost:8081`.

## What I Practiced

- Organizing code into controller, service, repository, and entity layers
- Mapping HTTP requests to Java methods
- Reading JSON request bodies
- Using Spring Data JPA to access MySQL
- Returning HTTP status codes with ResponseEntity
- Testing API requests with Postman
- Keeping database passwords outside source code
