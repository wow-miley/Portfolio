FROM openjdk:8-jdk
EXPOSE 8080:8080
RUN mkdir /app
COPY ./build/install/fritz2-ktor-todomvc/ /app/
WORKDIR /app/bin
CMD ["./fritz2-ktor-todomvc"]
