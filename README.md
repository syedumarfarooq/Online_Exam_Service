# Online_Exam_Service

## Overview
An Online Exam System built with microservices architecture using Spring Boot. This system facilitates user management, exam scheduling, and result processing, with services communicating via REST APIs.

##Microservices
User-Service
User registration, login, and profile management.
Exam-Service
Exam creation, scheduling, and question management.
Result-Service
Result generation and retrieval based on user submissions.

## Tools & Technologies
Spring Boot: Framework for developing Java-based microservices.
Eureka Server: Service discovery and dynamic addressing.
MySQL (XAMPP Server): Relational database for data storage.
Postman: Testing REST API endpoints.

## Setup Instructions:
Set Up Databases:
Open your XAMPP server and create the following databases:
user_db
exam_db
result_db

Run the Services
Start each service (User-Service, Exam-Service, Result-Service) in your IDE or via command line.
Verify they are registered on the Eureka dashboard.
Test APIs in Postman

## Example Requests:
### Example Requests:

#### 1. User-Service (POST)
URL: `http://localhost:8081/users/createUser`

```json
{
  "id": 1,
  "name": "Jane Doe",
  "email": "jane.doe@example.com",
  "password": "securepassword123"
}
```

2.Exam Service
<br>
URL: `http://localhost:8082/exams/createExam  `
<br>
```json
{ 
  "id": 1, 
  "title": "Java Basics", 
  "description": "Introduction to Java", 
  "scheduledAt": "2025-01-25T10:00:00" 
}
```
<br>

3.Result-Service (POST)
<br>
URL: `http://localhost:8083/results/createResult `
<br>
