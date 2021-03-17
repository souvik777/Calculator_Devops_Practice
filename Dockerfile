FROM openjdk:8
EXPOSE 8082
COPY target/calculatorpractice-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","calculatorpractice-1.0-SNAPSHOT-jar-with-dependencies.jar","calculator.App"]
