FROM amazoncorretto:17-alpine-jdk
MAINTAINER Maximiliano
COPY target/maximilianofigueroa-0.0.1-SNAPSHOT.jar maximilianofigueroa.jar
ENTRYPOINT ["java","-jar","/maximilianofigueroa.jar"]
EXPOSE 8080