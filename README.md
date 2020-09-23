# simple-cloud-stream-rabbitmq

#### A simple Spring Boot application using Spring Boot and Cloud Stream with RabbitMQ Message Broker.

**Prequisites:**

* Java 14
* [Apache Maven](https:http://maven.apache.org/)
* [RabbitMQ](https://activemq.apache.org/) Message Broker

You can download RabbitMQ on the above website, or if you have Docker installed,
grab an image from Docker Hub and run the image. 
```bash
docker pull rabbitmq
docker run -d --hostname my-rabbit --name rabbitmq -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```

## How to build and run

Assuming Java, Maven and RabbitMQ are already installed on your local machine

```bash
mvn clean package
```

the producer application

```bash
cd simple-rabbitmq-producer
mvn spring-boot:run
```

or

```bash
cd cd simple-rabbitmq-producer
java -jar target/simple-rabbitmq-producer-0.0.1-SNAPSHOT.jar
```

the consumer application

```bash
cd cd simple-rabbitmq-consumer                              
mvn spring-boot:run
```

or

```bash
cd consumer
java -jar target/simple-rabbitmq-consumer-0.0.1-SNAPSHOT.jar
```
create and send a message

```bash
curl -i http://localhost:8080/producer/YourMessage
```
