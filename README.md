# Recipe API + UI

As a world famous chef turned programmer, you want to create an API where people can create and view their favorite recipes.

## Requirements

### API

The API should support the following operations:

1. Create a new recipe
2. List all recipes
3. Get a single recipe
4. Update an existing recipe
5. Delete a recipe

A recipe should include the following data points

- id
- title
- directions
- createdDate
- updatedDate

The API should return data in JSON format

## Guidelines and Deliverables

### API

- You may use the language of your choice to build the API
- The API does not need to persist the recipes between restarts, but it should
  persist the recipes as long as it is running i.e. use an in-memory data store
  as opposed to a MySQL or PGSQL database
- Please provide instructions to run the API
- Please provide example requests
- Unit tests are welcome, but not required for assessment
