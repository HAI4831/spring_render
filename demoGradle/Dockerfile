# Stage 1: Build Stage
FROM ubuntu:latest AS build

# Install OpenJDK 17
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk && \
    apt-get clean

# Set working directory
WORKDIR /app

# Copy the application source code
COPY . .

# Make Gradle wrapper executable and build the application
RUN chmod +x gradlew && \
    ./gradlew --stacktrace bootJar --no-daemon

# Stage 2: Deployment Stage
FROM openjdk:17-jdk-slim

# Expose port 8080
EXPOSE 8080

# Set working directory
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/build/libs/demo-1.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
