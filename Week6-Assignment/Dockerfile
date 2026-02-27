FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /Week6-Assignment
# copy root parent pom so the module's parent can be resolved
COPY pom.xml ../pom.xml
COPY Week6-Assignment/pom.xml .
COPY Week6-Assignment/src ./src
RUN mvn clean package
CMD ["java", "-jar", "target/TemperatureConverter.jar"]
