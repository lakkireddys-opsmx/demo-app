FROM opsmx11/java:14.04-openjdk-8-jdk
#RUN apt-get update
EXPOSE 8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /opt/app.jar
ENTRYPOINT ["java","-jar","/opt/app.jar"]