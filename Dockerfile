FROM eclipse-temurin
WORKDIR /opt/app
EXPOSE 8080 8443
ENTRYPOINT exec java -jar hardwaredata-0.0.1-SNAPSHOT.jar

