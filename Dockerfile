# Use uma imagem base do Maven para compilar o projeto
FROM maven:3.8.4-openjdk-11 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Use uma imagem base do JDK para rodar o aplicativo
FROM openjdk:11-jre-slim
COPY --from=build /app/target/pgb-1.0-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
