# Microservices Demo Application

## About
- This is a demo SIM register application to learn about different tools used in microservice architecture. 
- There are 4 microservices in this project:
  - mytel-customer
  - mytel-calldetails
  - mytel-friend-family
  - mytel-plan
- A user can register itself using the mytel-ui (A sample angular application).

## Microservices Technologies

### Spring Cloud Config
- A springboot application called CloudConfigServer is created and configured to enable centralized configuration.
- All the configurations (common and profile specific) are present in https://github.com/aditya-pattnaik/ConfigDemo.git
- Spring cloud bus is configured using RabbitMq to enable broadcast of configuration changes in real-time.

### Eureka
- Eureka is used to enable service discovery. 
- All the microservices will register themselves with Eureka on start-up.
- Service status can be viewed on Eureka dashboard.

### Ribbon
- Ribbon is used for load balancing.
- Request from mytel-customer to mytel-friend-family will be load balanced as there are 2 instances of mytel-friend-family.

### Hystrix
- Hystrix is enabled for resilency.
- Exceptions will be handled and routed to fallback service using HystrixCommand.

### Zuul
- Zuul is used as a gateway
- Requests from mytel-ui (angular app) will be received in zuul application and the requests will be redirected to particular microservices.
- Zuul will be taking help from Eureka to discover the services.

### Sleuth and Zipkin
- Sleuth and Zipkin are configured to enable log tracing and monitoring.
