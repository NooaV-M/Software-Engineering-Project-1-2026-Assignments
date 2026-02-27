FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /Week6-Assignment
COPY pom.xml .
COPY src ./src
RUN mvn clean package
CMD ["java", "-jar", "target/TemperatureConverter.jar"]