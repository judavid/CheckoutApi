# CheckoutApi
Checkout Api

### Prerequisites
install
* jdk8
* docker
* docker-compose
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





