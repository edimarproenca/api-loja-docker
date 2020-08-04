FROM openjdk:8-jre
RUN mkdir app
ARG JAR_FILE
ADD /target/${JAR_FILE} /app/loja-docker.jar
WORKDIR /app
ENTRYPOINT java -jar loja-docker.jar