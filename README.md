Traini8 Backend Assignment - Spring Boot + PostgreSQL

Project Overview:

Imp: Provide username and password for the database i.e, postgres in "src/main/resources/application.properties" location
This project is an MVP for a registry of government-funded training centers. It provides two REST APIs:

POST /api/training-centers - Create a new training center.
GET /api/training-centers - Retrieve a list of all saved training centers.

Technologies Used
- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

Note down your PostgreSQL "username" and "password".
Configure Database in application.properties
Modify "src/main/resources/application.properties" to match your PostgreSQL credentials:
spring.datasource.url=jdbc:postgresql://localhost:5432/"your_database_name"
spring.datasource.username="your_db_username"
spring.datasource.password="your_db_password"

Testing Using Postman
POST AND GET API:
   - URL:"http://localhost:8080/api/training-centers".

traini8-backend/
├── src/main/java/com/example/
│   ├── model/               # Entity Classes
│   ├── repository/          # Database Repository
│   ├── service/             # Business Logic
│   ├── controller/          # API Controllers
│   ├── exception/           # Exception Handling
│   ├── Traini8Application.java  # Main Application
├── src/main/resources/
│   ├── application.properties  # Configuration File
├── pom.xml                   # Maven Dependencies
├── README.md                 # Documentation

