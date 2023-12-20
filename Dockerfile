# Basic nginx dockerfile starting with Ubuntu 20.04
# Dockerfile example
#FROM mcr.microsoft.com/java/jdk:11-zulu-centos as build

FROM gradle:4.2.1-jdk:11-zulu-centos
WORKDIR /app
COPY --from=0 /app/myProject /app

USER root                # This changes default user to root
RUN chown -R gradle /app # This changes ownership of folder
USER gradle              # This changes the user back to the default user "gradle"

RUN ./gradlew build --stacktrace

COPY build/libs/firstDemo-0.0.1-SNAPSHOT.jar ./app.jar

CMD ["./gradlew", "clean", "bootJar"]

EXPOSE 8080