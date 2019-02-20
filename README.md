# SpringBoot-Recipe-App
## Introdiction
[![CircleCI](https://circleci.com/gh/terryliu1995/SpringBoot-Recipe-App/tree/master.svg?style=svg)](https://circleci.com/gh/terryliu1995/SpringBoot-Recipe-App/tree/master)  

This repository is for learning Spring Framework 5. This is a recipe web application. People can create, view and update recipes here. Enjoy cooking time!  

Technical stack: Java, Springboot, Thymeleaf, Spring data JPA, Junit, MySQL, Bootstrap, Lombok, H2 in-memory database, Circle CI, Heroku.[Try](https://goodrecipe666.herokuapp.com) this app now!
## Project Structure
    .
    ├── Procfile
    ├── README.md
    ├── guru_database_create.sql
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── recipt.iml
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── guru
    │   │   │       └── springframework
    │   │   │           └── spring5recipeapp
    │   │   │               ├── Spring5RecipeAppApplication.java
    │   │   │               ├── bootstrap
    │   │   │               ├── commands
    │   │   │               ├── controllers
    │   │   │               ├── converters
    │   │   │               ├── domain
    │   │   │               ├── exceptions
    │   │   │               │   └── NotFoundException.java
    │   │   │               ├── repositories
    │   │   │               └── services
    │   │   ├── resources
    │   │   │   ├── application-default.properties
    │   │   │   ├── application-dev.yml
    │   │   │   ├── application-prod.yml
    │   │   │   ├── application.properties
    │   │   │   ├── data-h2.sql
    │   │   │   ├── messages.properties
    │   │   │   ├── static
    │   │   │   │   └── images
    │   │   │   └── templates
    │   │   │       ├── 400error.html
    │   │   │       ├── 404error.html
    │   │   │       ├── index.html
    │   │   │       └── recipe
    │   │   └── scripts
    │   │       ├── README.md
    │   │       └── configure-mysql.sql
    │   └── test
    └── target
