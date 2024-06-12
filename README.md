# Sample Spring Boot Application
### This is a sample Spring Boot application that demonstrates the use of Spring Boot with MySQL, Flyway, and Docker.

### How to run the application
Use the run configuration provided in .run directory to run the application with IntelliJ IDEA.

### How to run the application with Docker
1. Build the Spring Boot application using the following command:
```
mvn clean install -P cloud -DskipTests
```

2. Using application with Docker containers:

   a. Build the application using the following command:
   ```
   mvn clean install -P cloud -DskipTests 
   ```
   b. Start the application:
   ```
   docker-compose up
   ```
   c. Clean up the resources:
   ```
   docker-compose down --rmi all
   ```