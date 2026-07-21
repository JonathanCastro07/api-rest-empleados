# API REST - Gestión de Empleados

REST API for employee management built with Spring Boot, following a layered architecture (Controller → Service → Repository) backed by MySQL.

## Features

- Full CRUD for employees (create, read, update, delete)
- Layered architecture with a service interface decoupled from its implementation
- Centralized exception handling (`@RestControllerAdvice`): looking up, updating, or deleting a non-existent employee returns a proper `404 Not Found` with a structured error body instead of a raw `200`/`500`
- Unit tests for the service layer with Mockito, covering both the happy path and not-found scenarios

## Tech Stack

Java · Spring Boot · Spring Data JPA · Hibernate · MySQL · JUnit 5 · Mockito · AssertJ

## API

| Method | Endpoint | Description |
|---|---|---|
| POST | `/empleado` | Create an employee |
| GET | `/empleado` | List all employees |
| GET | `/empleado/{id}` | Get an employee by id — `404` if it doesn't exist |
| PUT | `/empleado/{id}` | Update an employee — `404` if the id doesn't exist |
| DELETE | `/empleado/{id}` | Delete an employee — `404` if the id doesn't exist |

## Running locally

### Prerequisites

- Java 17+
- MySQL running locally, with a database created for this app

### Configuration

Set your database connection in `src/main/resources/application.properties` (or override via environment variables):

```
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_empleados
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

### Run

```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`.

### Run tests

```bash
./mvnw test
```
