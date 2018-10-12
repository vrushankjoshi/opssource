FROM openjdk:8

RUN mkdir /usr/src/myapp
COPY ./target/CassandraConnector-1.0.jar /usr/src/myapp/CassandraConnector-1.0.jar
WORKDIR /usr/src/myapp

CMD ["java", " -jar ", " CassandraConnector-1.0.jar"]