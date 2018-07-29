# api-gateway-zuul

Zuul is an api-gateway created and open shourced by Netflix. Zuul acts as a proxy server for the configured microservice application. It enables dynamic routing(select paths according to real-time logical network layout changes), monitoring and security.

Zuul uses various types of filters to apply functionalities like dynamic routing, monitoring and security. Different types of filters are:
- pre filters are executed before the request is routed,
- route filters can handle the actual routing of the request,
- post filters are executed after the request has been routed, and
- error filters execute if an error occurs in the course of handling the request.

## How to use

This repository contains two SpringBoot based application HelloMicroServices and Gateway. Clone this reposirory and import them into you favourite IDE. Both application uses gradle as build tool, so clean build the application to download their dependencies. 
Running HelloMicroServices will expose a */greeting* route at port 8090. Running Gateway will start a proxy server at port 8080. Gateway is configured to mock HelloMicroServices's routes in its *application.properties* file. Now hit the */greeting* route using Gateway, for example: run both application on local machine and hit *https://localhost:8080/greeting* and you should be able to get JSON response *{"id":2,"content":"Hello, World!"}*.
