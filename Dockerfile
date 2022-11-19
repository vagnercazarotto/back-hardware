FROM eclipse-temurin
WORKDIR /opt/app
ARG JAR_FILE=target/*.jar
COPY hardwaredata-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080 8443
ENTRYPOINT exec java -jar app.jar

