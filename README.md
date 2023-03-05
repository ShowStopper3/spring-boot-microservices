# Spring Boot MicroServices
With the help of this repository you can run microservices using Spring Boot, Spring Cloud, Spring OAuth 2 and Netflix OSS framework.


## <a name="contributors"></a>Contributors

* [Sachin Sachdeva](https://www.linkedin.com/in/sachin-sachdeva-70896120/)

## <a name="application-architecture"></a>Application Compo

The application consists of 6 different services

* [config server](config-server/README.md) 
* [eureka-server](eureka-server/README.md) 
* [oauth2-server](oauth2a-server/README.md) 
* [zuul-gateway](zuul-gateway/README.md) 
* [customer-service](customer-service/README.md) 
* [order-service](order-service/README.md) 


## <a name="application-architecture"></a>Application Architecture

![screenshot!](images/image.png)


## <a name="project-overview"></a>Project Overview
* This project that mocks an e-commerce API where you can create a customer and orders.

* The customer can place orders having multiple products in it.

* This project uses KAFKA broker to communicate between the microservices.



## <a name="project-run"></a>How To Run ?
* You can run the project using following steps:
    * Install latest version of **Docker**  in your machine.
    * Clone this **GIT** repository.
    * Go to directory `spring-boot-microservice` on your system.
    * Run `docker-compose up --build` and then `docker-compose up`.
 
 
## <a name="rest-end"></a>Rest End Points.

* **To create a new customer- http://localhost:8080/v1/api/customer/create** :

     ![screenshot!](images/create.png)
 
* **To create a new order- http://localhost:8080/v1/api/order/create** :
 
    ![screenshot!](images/order.png)
 
* **To get the token for secure resource- http://localhost:8080/v1/api/secure/oauth/token** :
 
    ![screenshot!](images/get_token.png)
 
* **The above end point will produce response like below** :
 
    ![screenshot!](images/token_response.png)
 

* **To access secure resource or to delete all customers- http://localhost:8080/v1/api/customer/delete/all** :
 
    ![screenshot!](images/del_customer.png)
 
