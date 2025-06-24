Project Overview:
This project is an MVP for a registry of government-funded training centers. It provides two REST APIs:

1. POST /api/training-centers - Create a new training center.
2. GET /api/training-centers - Retrieve a list of all saved training centers.
Imp:
Provide username and password for the PostgreSQL database in "src/main/resources/application.properties" location.
Technologies Used
•	Java 17
•	Spring Boot 3
•	Spring Data JPA
•	PostgreSQL
•	Lombok
•	Maven
Configure Database in application.properties
Modify "src/main/resources/application.properties" to match your PostgreSQL credentials:

spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

Testing Using Postman
POST AND GET API:
URL: http://localhost:8080/api/training-centers
Project Structure

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
