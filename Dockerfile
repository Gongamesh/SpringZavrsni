FROM eclipse-temurin:21-jdk-alpine
MAINTAINER algebra-it.hr
COPY target/Zavrsni-0.0.1-SNAPSHOT.jar Zavrsni.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/Zavrsni.jar"]