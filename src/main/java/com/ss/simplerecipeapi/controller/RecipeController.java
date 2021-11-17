package com.ss.simplerecipeapi.controller;

import com.ss.simplerecipeapi.dto.Recipe;
import com.ss.simplerecipeapi.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@RestController
public class RecipeController {
    @Autowired
    RecipeRepository repo;

    @GetMapping("/recipes/{id}")
    public Recipe getRecipe(@PathVariable Integer id) {
        Optional<Recipe> foundRecipe = repo.findById(id);
        if (foundRecipe.isPresent()) {
            return foundRecipe.get();
        } else {
            return null;
        }
    }

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return repo.findAll();
    }
    @GetMapping("/recipes/category/{category}")
    public List<Recipe> getRecipesByCategory(@PathVariable String category) {
        return repo.findAllRecipesByCategory(category);
    }

    @PostMapping("/recipes")
    @ResponseStatus(HttpStatus.CREATED)
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        recipe.setCreatedDate(new Date());
        recipe.setUpdatedDate(new Date());
        return repo.save(recipe);
    }

    @PutMapping("/recipes")
    public void updateRecipe(@RequestBody Recipe recipe) {
        recipe.setUpdatedDate(new Date());
        repo.save(recipe);
    }

    @DeleteMapping("/recipes/{id}")
    public void deleteRecipe(@PathVariable Integer id) {
        repo.deleteById(id);
    }

}
