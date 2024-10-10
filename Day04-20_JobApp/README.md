## Day 4: Introduction to Spring Boot and Basics of API

### Topics Covered:
- Basics of API
- Status Codes in API
- Types of API Requests
- What is a Web Framework?
- Introduction to Spring Framework
- What is Spring Boot?
- Spring Boot Architecture

### Summary:
Today, I transitioned from core Java concepts to exploring the world of APIs and Spring Boot. 
Understanding the basics of APIs, their status codes, and types of requests was crucial. I also
delved into web frameworks, particularly the Spring Framework, and started my journey with 
Spring Boot, focusing on its architecture and fundamentals.

### Future Plans:
- Set up a simple Spring Boot project.
- Create and test basic API endpoints using Spring Boot.
- Learn about dependency injection and Spring Boot configurations.

---

## Day 5: Level Up with Spring Boot - Building a Job App

### Learning Summary

**Level up with Spring Boot: Building Job App**
- **Setting up Job Service**
- **Managing IDs**
- **Getting Single Job**
- **ResponseEntity Class**
- **Delete Job**
- **Update Job**
- **@RequestMapping Annotation**

**Getting started with JPA**
- **What is JPA?**
- **Understanding Data Layer**
- **H2 Database**
- **Configuring our Project for JPA**
- **Understanding Entities in JPA**
- **Defining JPA Repositories**
- **Making Jobs Persistent**

**Finishing Application**
- **Setting up Company Controller, Service, and Repository**
- **Getting All Companies**
- **Update Companies**
- **Creating Companies**
- **Company and Job Relationship**
- **Delete Company**
- **Get a Specific Company**
- **Defining Reviews API**
- **Defining Review Controller, Service, and Repository**
- **Company and Review Relationship**
- **Getting All Reviews of a Specific Company**
- **Add a Review for a Specific Company**
- **Get a Review by Review ID for a Specific Company**
- **Update a Review by Review ID for a Specific Company**
- **Delete a Review by Review ID for a Specific Company**

### Project: Job App

Developing Job App, focusing on setting up the service layer and implementing basic
CRUD operations. Also integrated JPA for database interactions and configured the H2 
in-memory database for testing purposes. The application was extended to include 
managing companies and reviews, showcasing relationships and additional CRUD operations.



---


## Progress for Day 6

Today, I made significant progress on the job application project by implementing 
monitoring and containerization features using Spring Boot Actuator and Docker.

### Spring Boot Actuator
- **Introduction to Spring Boot Actuator**: Set up Actuator in the Spring Boot application.
- **Endpoints Enabled**:
    - `/health`: Monitors the health of the application.
    - `/info`: Displays application information.
    - `/metrics`: Provides various metrics related to the application.
    - `/loggers`: Manages application log levels dynamically.
    - `/beans`: Lists all the beans in the application context.
    - `/shutdown`: Gracefully shuts down the application.

### Docker with Spring Boot
- **Introduction to Docker**: Reviewed Docker architecture and concepts.
- **Installation**: Installed Docker on Windows and Mac.
- **Containerizing Spring Boot Application**: Successfully containerized the job app.
- **Docker Commands**: Practiced essential Docker commands.
- **Testing**: Tested the Spring Boot application running inside a Docker container.


Got it! Here's the updated content reflecting that today is Day 7:


---


## Day 7: Migrating to PostgreSQL & Microservices

Today, I made significant progress by diving into PostgreSQL and Microservices:

### MIGRATING TO POSTGRESQL
- Learned the importance of PostgreSQL and why it’s preferred for certain applications.
- Added necessary dependencies to migrate our Spring Boot app to PostgreSQL.
- Configured the application to connect with PostgreSQL.
- Explored Docker Networks and ran PostgreSQL locally using Docker.
- Set up Docker Compose for multi-container applications.
- Used PGAdmin to create and manage PostgreSQL databases.
- Successfully tested the application with PostgreSQL.

### MICROSERVICES ARCHITECTURE:
- Explored the limitations of monolithic architecture and the benefits of Microservices.
- Planned the restructuring of the application into microservices for better scalability and maintainability.
- Created and refactored services:
  - Job Service
  - Company Service
  - Review Service
- Migrated the services to PostgreSQL and tested the changes using Docker Compose.
  
---

## Day 8

### Synchronous Communication: Inter-Service Communication Using RestTemplate
- Introduction to InterService communication.
- Why we need **RestTemplate** and how it simplifies communication between services.
- Communicating between microservices via **RestTemplate**.
- Implemented the **DTO Pattern** for cleaner data transfers.
- Tested inter-service communication using **Postman**.

### Service Registry and Inter-Service Communication with Eureka 🛰️
- Set up **Service Registry** using **Eureka Server**.
- Registered the **Job Microservice** with Eureka Server.
- Registered **Company Microservice** and **Reviews Microservice**.
- Updated the GET request to get a single job and restructured the response with **DTO**.
- Learned how **Eureka's HeartBeat Mechanism** works behind the scenes.

### Working with OpenFeign 🎛️
- Introduction to **OpenFeign** and how it simplifies REST clients.
- Enabled **Feign Clients** for cleaner inter-service communication.

### 📅 Next Steps
- Further explore inter-service communication strategies.
- Dive deeper into microservices architecture.

---


## Day 9

### 1. Distributed Tracing with Zipkin
- Introduction to Distributed Tracing
- Zipkin Installation and Setup
- Integrating Zipkin with Spring Boot Microservices using Micrometer
- Testing changes and troubleshooting common issues

### 2. Setting Up Config Server
- Understanding Configuration Management
- Setting up Spring Cloud Config Server and Client
- Mapping Config Server to a Git Repository for central configuration management

### 3. API Gateways
- Overview of API Gateway functions
- Setting up Spring Cloud Gateway
- Routing with Eureka Discovery and load balancing using `lb://` URIs
- API Gateway integration with Eureka Discovery Server

---

