#FROM openjdk:11-jdk
FROM openjdk:11.0.14-oracle

WORKDIR /app

COPY target/testandologs-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]