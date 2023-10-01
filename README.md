# Online Store (in progress)

* [General info](#general-info)
* [Requirement](#requirements)
* [API Documentation](#api-documentation)
* [Technologies](#technologies)

## General info

Online store for the sale and management of goods

## Requirements

#### Admin:

> * should be able to add, modify and delete products

#### Client:

> * should be able to add products to the basket
> * should be able to order products
> * should be able to choose the appropriate payment method

> * should receive an email that the order was successful
> 
> * should receive a special discount when ordering a larger quantity of the product

#### UX/UI:

> * use pagination to view products

## API Documentation:

| Operation                | URL template                          |
| ------------------------ | ------------------------------------- |
| Swagger UI               | http://loclahost:8080/swagger-ui.html |
| OpenAPI  (springdoc)     | http://loclahost:8080/v3/api-docs     |
| Get a list of products   | GET /products                         |
| Get a list of categories | GET /admin/categories                 |
| Get a category by ID     | GET /admin/categories/{id}            |
| Create a new category    | POST /admin/categories                |
| Delete a category by ID  | DELETE /admin/categories/{id}         |
| Get a list of products   | GET /admin/products                   |
| Get a category by ID     | GET /admin/products/{id}              |
| Create a new product     | POST /admin/products                  |
| Upload a product image   | POST /admin/products/upload-image     |
| Get a product image      | GET /admin/productImage/{filename}    |
| Delete a product by ID   | DELETE /admin/products                |

## ![db_shop](C:\IT\JAVA\PORTFOLIO\Shop\db_shop.png)

## Technologies

* Java 17
* Angular 14
* Spring Boot
* Spring Security
* Spring Data
* Swagger
* Liquibase
* JUnit 5
* AssertJ
* Mockito
* Lombok
* MySQL
* Git
