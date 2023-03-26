FROM amazoncorretto:17-alpine-jdk
MAINTAINER Maximiliano
COPY target/maximilianofigueroa-0.0.1-SNAPSHOT.jar maximilianofigueroa-app.jar
ENTRYPOINT ["java","-jar","/maximilianofigueroa-app.jar"]
EXPOSE 8080