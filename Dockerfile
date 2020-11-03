FROM openjdk:latest

ADD target/demo-2-0.0.1-SNAPSHOT.war app.war

ENTRYPOINT ["java","-jar","app.war"]

EXPOSE 8080