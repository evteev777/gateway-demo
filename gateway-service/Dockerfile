# Dockerfile
FROM eclipse-temurin:21-jdk

ARG JAR_FILE=target/gateway-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
