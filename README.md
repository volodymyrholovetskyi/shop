# Online Store (in progress)

* [General info](#general-info)
* [Requirement](#requirements)
* [Use Case](#use-case)
* [Technologies](#technologies)

## General info

Online store for selling goods and managing goods

## Requirements

#### Admin:

> * admin can add, modify and delete products

#### Client:

> * should be able to add products to the basket
> * should be able to order products
> * should be able to choose the appropriate payment method

> * should receive an email that the order was successful
> 
> * should receive a special discount when ordering a larger quantity of the product

#### UX/UI:

> * product views should be divided into pages (use pagination)
> 
> * ## Use Case

| url                            | call method   | description                |
| ------------------------------ | ------------- | -------------------------- |
| http://localhost:8080/products | getProducts() | getting a list of products |

## Technologies

* Java 17
* Angular 14
* Spring Boot
* Spring Security
* Spring Data
* JUnit 5
* AssertJ
* Mockito
* Lombok
* MySQL
* Git
