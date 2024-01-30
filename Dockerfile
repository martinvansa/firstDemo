FROM mcr.microsoft.com/java/jdk:11-zulu-centos as build

COPY . /src
WORKDIR /src

RUN chmod 0755 ./gradlew

RUN ./gradlew clean build

FROM mcr.microsoft.com/java/jdk:11-zulu-centos

COPY --from=build /src/build/libs/firstDemo-0.0.1-SNAPSHOT.jar /deployments/app.jar

ENTRYPOINT ["java","-jar","/deployments/app.jar"]

EXPOSE 8080