# CRUD-Operation-Spring-Boot
This project demonstrates how to create a simple CRUD (Create, Read, Update, Delete) application using Spring Boot.
Prerequisites
Before you begin, ensure you have met the following requirements:

Java JDK 11 or higher
Maven or Gradle
An IDE like IntelliJ IDEA or Eclipse
Postman or any other API testing tool (optional)
Getting Started
Clone the repository:

bash
Copy code
git clone https://github.com/Mahi0503/CRUD-Operation-Spring-Boot.git
cd spring-boot-crud
Build the project: If you're using Maven:

bash
Copy code
mvn clean install
If you're using Gradle:

bash
Copy code
./gradlew build
Open the project in your IDE.

Project Structure
css
Copy code
spring-boot-crud
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── crud
│   │   │               ├── controller
│   │   │               ├── entity
│   │   │               ├── repository
│   │   │               └── service
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
API Endpoints
Method	Endpoint	Description
GET	/api	Retrieve all items
POST	/api	Create a new item
PUT	/api/{id}	Update an existing item
DELETE	/api/{id}	Delete an item by ID
Running the Application
To run the application, use the following command:

bash
Copy code
mvn spring-boot:run
Alternatively, you can run the main method in the CrudApplication class from your IDE.

Testing the Application
You can use Postman or any other REST client to test the API endpoints. Here's how to test the CRUD operations:

Create an Item (POST):

URL: http://localhost:8080/api
Body (JSON):
json
Copy code
{
  "name": "Item Name",
  "description": "Item Description"
}
Get All Items (GET):

URL: http://localhost:8080/api
Get an Item by ID (GET):

URL: http://localhost:8080/api/{id}
Update an Item (PUT):

URL: http://localhost:8080/api/{id}
Body (JSON):
json
Copy code
{
  "name": "Updated Item Name",
  "description": "Updated Item Description"
}
Delete an Item (DELETE):

URL: http://localhost:8080/api{id}
Technologies Used
Spring Boot
Spring Data JPA
H2 Database (for in-memory testing)
Maven (or Gradle)
Java 11
