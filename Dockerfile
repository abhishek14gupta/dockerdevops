FROM openjdk:8
RUN mkdir /app
WORKDIR /app
COPY target/devops-0.0.1-SNAPSHOT.jar /app
EXPOSE 4300

ENTRYPOINT ["java", "-jar", "devops-0.0.1-SNAPSHOT.jar"]
