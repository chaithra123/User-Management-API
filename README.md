# User Management API

This project implements a **User Management API** integrated with **Kong Gateway** and hosted on **Azure App Service**. It demonstrates key API Gateway features such as authentication and rate limiting, with a Spring Boot backend.

## Features

### Endpoints
- **GET /users**: Retrieve a list of all users.
- **POST /users**: Add a new user.

### API Gateway
The **Kong Gateway** handles:
- **API Key Authentication**: Secure access to API endpoints.
- **Rate Limiting**: Restrict the number of requests to prevent abuse.

### Hosting
- Backend deployed on **Azure App Service** for scalable and reliable hosting.

### Observability
- **Logs and Metrics** captured using **Azure Monitor** for improved system observability.

## Technologies Used
- **Backend**: [Spring Boot (Java)](https://spring.io/projects/spring-boot)
- **API Gateway**: [Kong Gateway](https://konghq.com/)
- **Hosting**: [Azure App Service](https://azure.microsoft.com/en-us/services/app-service/)
- **Monitoring**: [Azure Monitor](https://azure.microsoft.com/en-us/services/monitor/)

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)** 11 or later.
- **Kong Gateway** installed or accessible.
- An **Azure account** to deploy the app service.

### Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/user-management-api.git
   cd user-management-api
   
2. **Configure the Application:**

   Update the application.properties file with appropriate database and Azure configuration.


3. **Run the Backend:**
``` bash
 ./mvnw spring-boot:run
