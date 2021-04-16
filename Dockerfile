FROM openjdk:14.0-jdk-slim
EXPOSE 9191
VOLUME /tmp
ADD ./target/prueba-0.0.1-SNAPSHOT.jar servicio.jar
ENTRYPOINT ["java","-jar","/servicio.jar"]