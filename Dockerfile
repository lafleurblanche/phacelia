FROM openjdk:17
ARG JAR_FILE=target/*all.jar
COPY ${JAR_FILE} phacelia.jar
ENTRYPOINT ["java","-jar","/phacelia.jar"]
