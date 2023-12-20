# Basic nginx dockerfile starting with Ubuntu 20.04
# Dockerfile example
FROM mcr.microsoft.com/java/jdk:11-zulu-centos as build

COPY firstDemo/ /src
WORKDIR /src

RUN chmod 0755 ./gradlew

RUN ./gradlew clean build

FROM mcr.microsoft.com/java/jdk:11-zulu-centos

COPY build/libs/firstDemo-0.0.1-SNAPSHOT.jar /deployments/app.jar

CMD ["./gradlew", "clean", "bootJar"]

EXPOSE 8080