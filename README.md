# Recipe API

As a world famous chef turned programmer, you want to create an API where people can create and view their favorite recipes.

## Requirements

### API

The API should support the following operations:

1. Create a new recipe
2. Add Ingredients to a recipe
3. List all recipes
4. Get a single recipe and its ingredients
5. Update an existing recipe and its ingredients
6. Delete a recipe
7. Delete an ingredient

A recipe should include the following data points

- id
- title
- ingredients
- directions
- createdDate
- updatedDate

The API should return data in JSON format

## Guidelines and Deliverables

### API

- You may use the language of your choice to build the API
- The API does not need to persist the recipes between restarts, but it should
  persist the recipes as long as it is running i.e. use an in-memory data store
  as opposed to a MySQL or PGSQL database. Use something besides an object
  array or list, if possible.
- Please provide instructions to run the API
- Please provide example requests
- Unit tests are welcome, but not required for assessment


### Implementation

  - The API is implemented n JAVA using Spring Boot Frame work. 

### How-To-Run

  - The easiest way to run this API, is to clone the code to your local machine, open the pom.xml using intelliJ IDE and run the application. The API uses localhost & port 8080. You may also want to modify the mysql password in application.properties file. If need be you can change the port other than 8080. The swagger documentation is provided here in openapi.yaml in yaml format and openapi.md in markdown format. There are end points to seed and clear the data. Otherwise the implementation of the app just captures the MVP outlined in the above requirements.

### Example Requests

  - Can be inferred from the swagger documentation openapi.yaml / openapi.md

### Future Extension

  - Would have loved to add some unit tests, MockMVC / Mockito test. Because of lack of time I did not.
  - Would have loved to add proper customer error/exception handling. Did not add because of lack of time.
  Given more time I would definitely work on them
  - Explore the possibility of adding user authorization/authentication etc., - may for a future time.
  - Would love to deploy it in Heroku /Netlify/AWS Beanstalk free PaaS sites, so that API can be tested right from editor.swagger.io. Whenever I get time, I will attempt this.
  - Would attempt the front end for this API , most likely in react, when time permits.