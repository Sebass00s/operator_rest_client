FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/api_rest_server-0.0.1-SNAPSHOT.jar api_rest_server.jar
ENTRYPOINT ["java","-jar","/api_rest_server.jar"]