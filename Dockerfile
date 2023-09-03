# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080 8000

ADD target/remote-debugging.jar remote-debugging.jar
ADD entrypoint.sh entrypoint.sh

ENTRYPOINT ["sh","/entrypoint.sh"]