# Backend API Demo
A Spring Boot application
* Spring Boot (parent 3.1.4)
  * Spring Data REST
  * Spring Data JPA
  * MySQL Driver

# Description
This backend API demo was a final project for a backend Java course. The intent was to give exposure to the Spring Boot framework.
The demo app utilizes Spring data rest to expose the JPA entities as RESTful endpoints. The data is persisted in a MySQL database.
This project originally used an Angular frontend UI however the UI was not my work and so is not included in this repository.
The REST endpoints can be tested using Postman or a similar tool.  
  
The application exposes a basic set of api endpoints to handle purchase and cart data for a fictional vacation site.  
  
NOT FOR PRODUCTION USE  
  

# Usage
1. Clone the repository to your local machine.
2. Deploy a MySQL server to the local machine (Docker or local installation)
3. Create a MySQL user ecommerce/ecommerce
4. Run the schema.sql file in src/main/resources/schema.sql to create and populate the DB
5. Run the application and test the endpoints