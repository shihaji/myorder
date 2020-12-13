FROM openjdk:8
EXPOSE 8080
ADD target/AwsOrder.jar AwsOrder.jar
ENTRYPOINT ["java","jar","/AwsOrder.jar"]
