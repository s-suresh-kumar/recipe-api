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
  array or list.
- Please provide instructions to run the API
- Please provide example requests
- Unit tests are welcome, but not required for assessment
