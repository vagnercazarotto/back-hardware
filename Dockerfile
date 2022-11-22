FROM eclipse-temurin
WORKDIR /opt/app
COPY ./target/hardwaredata-0.0.1-SNAPSHOT.jar hardwaredata-0.0.1-SNAPSHOT.jar
EXPOSE 8080 8443
ENTRYPOINT exec java -jar hardwaredata-0.0.1-SNAPSHOT.jar

