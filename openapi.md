# Api Documentation
Api Documentation

## Version: 1.0

### Terms of service
urn:tos

**License:** [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0)

### /ingredients

#### PUT
##### Summary

updateIngredient

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

#### POST
##### Summary

createIngredient

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

### /ingredients/id/{id}/recipeId/{recipeId}

#### POST
##### Summary

addIngredientToRecipe

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | path | id | Yes | integer |
| recipeId | path | recipeId | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

### /ingredients/recipe/{id}

#### GET
##### Summary

getIngredientsByRecipe

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | path | id | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

### /ingredients/{id}

#### GET
##### Summary

getIngredient

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | path | id | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

#### DELETE
##### Summary

deleteIngredient

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | path | id | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 204 | No Content |
| 401 | Unauthorized |
| 403 | Forbidden |

### /clear-all-data

#### GET
##### Summary

clearAllData

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

### /seed-initial-data

#### GET
##### Summary

seedData

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

### /recipes

#### GET
##### Summary

getAllRecipes

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

#### PUT
##### Summary

updateRecipe

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

#### POST
##### Summary

createRecipe

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

### /recipes/category/{category}

#### GET
##### Summary

getRecipesByCategory

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| category | path | category | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

### /recipes/{id}

#### GET
##### Summary

getRecipe

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | path | id | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

#### DELETE
##### Summary

deleteRecipe

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | path | id | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 204 | No Content |
| 401 | Unauthorized |
| 403 | Forbidden |

### Models

#### Ingredient

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| amount | string |  | No |
| description | string |  | No |
| ingredientId | integer |  | No |
| name | string |  | No |
| recipeId | integer |  | No |

#### Recipe

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| category | string |  | No |
| cookTime | string |  | No |
| createdDate | dateTime |  | No |
| directions | string |  | No |
| ingredients | [ object ] |  | No |
| prepTime | string |  | No |
| recipeId | integer |  | No |
| servings | integer |  | No |
| title | string |  | No |
| updatedDate | dateTime |  | No |
