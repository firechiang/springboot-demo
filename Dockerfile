FORM openjdk:8-jre-alpine
COPY target/springboot-demo-0.0.1-SNAPSHOT.jar /springboot-demo-0.0.1.jar
ENTRYPOINT ["java","-jar","/springboot-demo-0.0.1.jar"]