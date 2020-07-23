# Spring Boot Demo API

This is a simple Spring-Boot Demo application to demonstrate a quick and simple API.

It covers,

```
  Maven Packaging and Tests
  Docker Build and Packaging
  Kubernetes CRD's
  Helm Chart
```

It has one endpoint which returns a JSON response containing the hostname and IP of the server and an obligatory hello world message. 

## Requirements
 * Java 1.8
 * Maven
 
## Using the API
Simply start the app and make a HTTP GET request to http://localhost:9090/ and you will get a JSON response.

## Docker Build
The application has been built and packaged in a Docker container and published to DockerHub: https://hub.docker.com/repository/docker/isaggiodev/springboot-demo-service

## How To

#### Clean and Build
```
mvn clean package
```

#### Run
```
mvn spring-boot:run
open http://localhost:8080/
```
Or
```
java -jar ./target/spring-boot-demo-2.0.0-SNAPSHOT.jar
```

#### Test
```
mvn verify
```

#### Docker Build
```
mvn package docker:build
```
Or

```
mvn package docker:build -Dmaven.test.skip=true
```

#### Docker Push (Manual)
```
docker login
docker tag <version> isaggiodev/springboot-demo-service
docker push isaggiodev/springboot-demo-service
```

```
docker run -p 9090:9090 -h docker-java isaggiodev/springboot-demo-service:latest
```

#### Maven Build/Deploy - Docker Build/Deploy
```
mvn deploy
```

#### Above is Equal to,
Consistent build lifecycle

```
mvn package
mvn dockerfile:build
mvn verify
mvn dockerfile:push
mvn deploy
```

#### Helm Kickstarter

```
helm install helm-sbd --name spring-boot-demo
```

