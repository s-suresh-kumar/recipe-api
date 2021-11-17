package com.ss.simplerecipeapi.controller;

import com.ss.simplerecipeapi.dto.Recipe;
import com.ss.simplerecipeapi.dto.Ingredient;
import com.ss.simplerecipeapi.repository.IngredientRepository;
import com.ss.simplerecipeapi.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@RestController
public class PrepopulateController {
    @Autowired
    RecipeRepository recipeRepo;
    @Autowired
    IngredientRepository ingredientRepo;

//    public PrepopulateController(RecipeRepository recipeRepo, IngredientRepository ingredientRepo) {
//        this.recipeRepo = recipeRepo;
//        this.ingredientRepo = ingredientRepo;
//    }
//Let us use a GET method, since we do not want to get requestBody and process it
    // But still we will save in db some hard coded stuff

    @GetMapping("/seed-initial-data")
    public void seedData() {
        System.out.println("In seed-initial-data seedData");
        Recipe recipe =  new Recipe();
        recipe.setTitle("Mediterranean Spread");
        recipe.setCategory("Appetizers");
        recipe.setDirections(" Step 1\n" +
                "\n" +
                "Mix cream cheese, sour cream, feta cheese, garlic powder, and dill weed in a bowl until well blended.\n" +
                "Step 2\n" +
                "\n" +
                "Cover and refrigerate for 30 minutes before serving.\n\n");
        recipe.setPrepTime("5 min");
        recipe.setCookTime("30 min");
        recipe.setCreatedDate(new Date());
        recipe.setUpdatedDate(new Date());
        recipe.setServings(4);
        Set<Ingredient> ingredientSet= new HashSet<>();
     //   recipe.setIngredients(ingredientSet);
      //  recipe = recipeRepo.save(recipe);

        //Now update the recipeIds of all the ingredients of the above recipe using its recipeId
        Integer recipeId = recipe.getRecipeId();

        Ingredient ingredient = new Ingredient();
        ingredient.setDescription("1 (8 ounce) package cream cheese, softened");
        ingredient.setName("cream cheese");
        ingredient.setAmount("8 oz.");
      //  ingredient.setRecipeId(recipeId);
       // Set<Ingredient> ingredientSet1= new HashSet<>();
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("sour cream");
        ingredient.setName("sour cream");
        ingredient.setAmount("1/4 cup");
      //  ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("1 (4 ounce) container crumbled feta cheese sour cream");
        ingredient.setName("feta cheese");
        ingredient.setAmount("4 oz.,");
      //  ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("2 teaspoons garlic powder");
        ingredient.setName("garlic powder");
        ingredient.setAmount("2 teasponns");
       // ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("2 teaspoons dried dill weed");
        ingredient.setName("dried dill weed");
        ingredient.setAmount("2 teasponns");
     //   ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        recipe.setIngredients(ingredientSet);
        recipe = recipeRepo.save(recipe);



        recipe =  new Recipe();
        recipe.setTitle("Baked Jalapeno Poppers");
        recipe.setCategory("Appetizers");
        recipe.setDirections(" Step 1\n" +
                "\n" +
                "Preheat oven to 400 degrees F (200 degrees C). Spray a baking sheet with cooking spray.\n" +
                "Step 2\n" +
                "\n" +
                "Fill each jalapeno pepper half with cream cheese, Cheddar cheese, and bread crumbs, respectively, and arrange peppers on the prepared baking sheet.\n" +
                "Step 3\n" +
                "\n" +
                "Bake in the preheated oven until jalapenos are tender and cheese melts, about 20 minutes.\n");
        recipe.setPrepTime("20 min");
        recipe.setCookTime("20 min");
        recipe.setCreatedDate(new Date());
        recipe.setUpdatedDate(new Date());
        recipe.setServings(4);
        ingredientSet= new HashSet<>();
    //    recipe.setIngredients(ingredientSet);
      //  recipe = recipeRepo.save(recipe);


        recipeId = recipe.getRecipeId();

        ingredient = new Ingredient();
        ingredient.setDescription("cooking spray");
        ingredient.setName("cooking spray");
        ingredient.setAmount("N/A");
     //   ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("12 jalapeno peppers, halved lengthwise and seeded ");
        ingredient.setName("jalapeno pppers");
        ingredient.setAmount("12");
      //  ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("2 ounces cream cheese, softened ");
        ingredient.setName("cream cheese");
        ingredient.setAmount("2 ounces,");
     //   ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("2 ounces shredded Cheddar cheese ");
        ingredient.setName("cheddar cheese");
        ingredient.setAmount("2 ounces");
        ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("¼ cup panko bread crumbs ");
        ingredient.setName("bread crumbs");
        ingredient.setAmount("1/4 cup");
    //    ingredient.setRecipeId(recipeId);
        ingredientSet.add(ingredient);

        recipe.setIngredients(ingredientSet);

        recipe = recipeRepo.save(recipe);

    }

    @GetMapping("/clear-all-data")
    public void clearAllData() {
        this.recipeRepo.deleteAll();
    }
}
