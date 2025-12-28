FROM alpine/java:22-jdk

WORKDIR /app

COPY . .

RUN "javac", "Main.java"

CMD ["java","Main"]
