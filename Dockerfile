FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# El comando "sleep 5" le da tiempo a la red de Render para estabilizarse antes de lanzar Java
ENTRYPOINT ["sh", "-c", "sleep 5 && java -Djava.net.preferIPv4Stack=true -jar app.jar"]