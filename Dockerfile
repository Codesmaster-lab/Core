FROM openjdk:19
EXPOSE 8080
ADD target/core.jar core.jar
ENTRYPOINT ["java","-jar","/core.jar"]
