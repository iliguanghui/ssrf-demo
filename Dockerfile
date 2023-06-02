FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
ENV ARTHAS_VERSION=3.6.7
EXPOSE 8080
COPY target/*.jar ./app.jar
CMD ["sh", "-c", "exec java -jar ${JAVA_OPTS} app.jar"]
