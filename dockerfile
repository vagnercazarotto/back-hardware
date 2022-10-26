FROM registry.app.corpintra.net/tsy-24x7/base
WORKDIR /opt/app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080 8443
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar

