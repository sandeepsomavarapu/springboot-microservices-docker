FROM alpine:latest

# Install OpenJDK 8
RUN apk add --no-cache openjdk8-jre

WORKDIR /app
COPY target/*.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "app.jar"]