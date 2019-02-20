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
    │   │   │               │   ├── BootStrapMySQL.java
    │   │   │               │   └── RecipeBootstrap.java
    │   │   │               ├── commands
    │   │   │               │   ├── CategoryCommand.java
    │   │   │               │   ├── IngredientCommand.java
    │   │   │               │   ├── NotesCommand.java
    │   │   │               │   ├── RecipeCommand.java
    │   │   │               │   └── UnitOfMeasureCommand.java
    │   │   │               ├── controllers
    │   │   │               │   ├── ControllerExceptionHandler.java
    │   │   │               │   ├── ImageController.java
    │   │   │               │   ├── IndexController.java
    │   │   │               │   ├── IngredientController.java
    │   │   │               │   └── RecipeController.java
    │   │   │               ├── converters
    │   │   │               │   ├── CategoryCommandToCategory.java
    │   │   │               │   ├── CategoryToCategoryCommand.java
    │   │   │               │   ├── IngredientCommandToIngredient.java
    │   │   │               │   ├── IngredientToIngredientCommand.java
    │   │   │               │   ├── NotesCommandToNotes.java
    │   │   │               │   ├── NotesToNotesCommand.java
    │   │   │               │   ├── RecipeCommandToRecipe.java
    │   │   │               │   ├── RecipeToRecipeCommand.java
    │   │   │               │   ├── UnitOfMeasureCommandToUnitOfMeasure.java
    │   │   │               │   └── UnitOfMeasureToUnitOfMeasureCommand.java
    │   │   │               ├── domain
    │   │   │               │   ├── Category.java
    │   │   │               │   ├── Difficulty.java
    │   │   │               │   ├── Ingredient.java
    │   │   │               │   ├── Notes.java
    │   │   │               │   ├── Recipe.java
    │   │   │               │   └── UnitOfMeasure.java
    │   │   │               ├── exceptions
    │   │   │               │   └── NotFoundException.java
    │   │   │               ├── repositories
    │   │   │               │   ├── CategoryRepository.java
    │   │   │               │   ├── RecipeRepository.java
    │   │   │               │   └── UnitOfMeasureRepository.java
    │   │   │               └── services
    │   │   │                   ├── ImageService.java
    │   │   │                   ├── ImageServiceImpl.java
    │   │   │                   ├── IngredientService.java
    │   │   │                   ├── IngredientServiceImpl.java
    │   │   │                   ├── RecipeService.java
    │   │   │                   ├── RecipeServiceImpl.java
    │   │   │                   ├── UnitOfMeasureService.java
    │   │   │                   └── UnitOfMeasureServiceImpl.java
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
    │   │   │           ├── imageuploadform.html
    │   │   │           ├── ingredient
    │   │   │           │   ├── ingredientform.html
    │   │   │           │   ├── list.html
    │   │   │           │   └── show.html
    │   │   │           ├── recipeform.html
    │   │   │           └── show.html
    │   │   └── scripts
    │   │       ├── README.md
    │   │       └── configure-mysql.sql
    │   └── test
    └── target