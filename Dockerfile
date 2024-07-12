# Use a imagem base do OpenJDK
FROM openjdk:17-ea-10-jdk-slim

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR do seu projeto para o contêiner
COPY target/*.jar /app/app.jar

# Exponha a porta 8080 (ou a porta que você desejar)
EXPOSE 8080

# Comando para iniciar o aplicativo Spring Boot
CMD ["java", "-jar", "/app/app.jar"]
