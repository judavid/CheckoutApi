# CheckoutApi
Checkout Api

In this project, sprint-boot was used to create and configure each of the projects of each microservice, 
for the creation of the applications the spring framework is used with the MVC pattern and the documentation api
was used swagger2, the compilation is done with maven and the deployment in a dockerized environment it is done with docker compose.

### Prerequisites
install
* jdk8
* Docker version 19.03.5 or higher
* docker-compose version 1.24.1 or higher
* Apache Maven 3.6.3 or higher

### Installing
after clone the repository to inside the folder /CheckoutApi in the root of repository.

* Enter the folder /BillService, open a console and execute ```mvn clean install```
* Enter the folder /LogisticService, open a console and execute ```mvn clean install```
* Enter the folder /Checkout, open a console and execute ```mvn clean install```

At the folder /CheckoutApi execute
```
docker-compose up
```
This instruction execute the file "docker-compose.yml" this file create 3 images with 3 containers.
each container corresponde to microservices "Bill", "Logistic" and "Checkout".
* The microservice "Bill" run on the port "8081"
* The microservice "Logistic" run on the port "8082"
* The microservice "Checkout" run on the port "8080"


if you want to run the microservices in a different environment than docker, you must modify the file 
"application.properties" of the Checkout project, in this file you must put the IPs of the hosts where
the Bill and Losgistic microservices run





