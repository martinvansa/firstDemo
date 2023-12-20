# Basic nginx dockerfile starting with Ubuntu 20.04
# Dockerfile example

FROM mcr.microsoft.com/java/jdk:11-zulu-centos as build

WORKDIR /app

CMD ["./gradlew", "clean", "bootJar"]

COPY build/libs/firstDemo-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080