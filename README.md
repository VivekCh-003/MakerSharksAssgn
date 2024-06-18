# MakerSharksAssgn

# MakerSharksAssgn

## Introduction
This project is a simple Spring Boot application that provides RESTful API endpoints for user registration and user details fetching. The application uses MongoDB for storing user data.

## Requirements
- Java 17
- Maven
- MongoDB

Application runs on port 8081

To pull the Docker image run : docker pull vivek31/makersharks:latest
To run the image : docker run -p 8081:8081 vivek31/makersharks:latest

After starting the application, it can be accessed at Swagger endpoint : http://localhost:8081/swagger-ui/index.html


API Endpoints

1. Register a New User
  - URL: /api/user/register
  - Method: POST
  - Request Body: json
    {
      "username": "your_username",
      "email": "your_email@example.com",
      "password": "your_password"
    }

2. Fetch User Details
  - URL: /api/user/fetch
  - Method: GET
  - Query Parameter: username
    

