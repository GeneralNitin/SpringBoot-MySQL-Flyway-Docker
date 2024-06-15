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

### Note:

The reason I created this project was that I was not able to set up one of my company's projects to run locally. I
thought there was an issue with how Flyway works in a containerized environment. So, I created this project to test it.
Initially, I encountered the same issue here as well, but today I was able to resolve it and run this sample application
successfully.

What was the issue?
Firstly, the issue was with my MySQL container. I was using a directory `local-mysql-data` as a volume to mount to my
MySQL container. The problem was that the contents of this directory were not getting deleted, so the configuration with
which I tested the first time was still being used.

To resolve this, I did two things:

1. Deleted the volume created by Docker Compose using `docker volume rm spring-dockercompose_db_data`.
2. Deleted the local-mysql-data directory.
   After that, I ran `docker-compose up` and it worked like a charm.
