FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /Week6-Assignment
COPY Week6-Assignment/pom.xml .
COPY Week6-Assignment/src ./src
RUN mvn clean package
CMD ["java", "-jar", "target/TemperatureConverter.jar"]
