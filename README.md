# User Management API

API REST desarrollada con **Java**, **Spring Boot** y **MySQL** para la gestión de usuarios. Este proyecto fue realizado con el objetivo de fortalecer conocimientos en desarrollo backend, arquitectura por capas y creación de servicios REST.

---

## Tecnologías utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Git
- GitHub
- Postman

---

## Funcionalidades

- Crear un usuario.
- Consultar todos los usuarios.
- Buscar un usuario por ID.
- Actualizar la información de un usuario.
- Eliminar un usuario.

---

## Arquitectura del proyecto

```
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
MySQL
```

---

## Estructura del proyecto

```
src
└── main
    └── java
        └── com.example.usermanagement
            ├── controller
            ├── service
            ├── repository
            ├── model
            └── UserManagementApplication
```

---

## Base de datos

Tabla: **usuarios**

| Campo | Tipo |
|-------|------|
| id | Long |
| nombre | String |
| apellido | String |
| correo | String |
| telefono | String |

---

## Endpoints

| Método | Endpoint | Descripción |
|---------|----------|-------------|
| GET | /users | Lista todos los usuarios |
| GET | /users/{id} | Consulta un usuario |
| POST | /users | Crea un usuario |
| PUT | /users/{id} | Actualiza un usuario |
| DELETE | /users/{id} | Elimina un usuario |

---

## Cómo ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/Juanpacas22/user-management-java.git
```

### 2. Abrir el proyecto

Importar el proyecto en IntelliJ IDEA como proyecto Maven.

### 3. Configurar la base de datos

Crear una base de datos en MySQL y actualizar el archivo:

```
application.properties
```

con tus credenciales.

### 4. Ejecutar

```bash
mvn spring-boot:run
```

o ejecutar la clase principal desde IntelliJ IDEA.

---

## Próximas mejoras

- Validaciones con Bean Validation.
- Manejo global de excepciones.
- DTO para la transferencia de datos.
- Documentación con Swagger/OpenAPI.
- Pruebas unitarias.
- Spring Security.

---

## Autor

**Juan Pablo Castañeda Cartagena**

- GitHub: https://github.com/Juanpacas22
- LinkedIn: https://linkedin.com/in/juan-pablo-castañeda-cartagena-250a64165
