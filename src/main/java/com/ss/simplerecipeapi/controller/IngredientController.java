package com.ss.simplerecipeapi.controller;

import com.ss.simplerecipeapi.dto.Ingredient;
import com.ss.simplerecipeapi.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IngredientController {
    @Autowired
    IngredientRepository repo;

    @GetMapping("ingredients/{id}")
    public Ingredient getIngredient(@PathVariable Integer id) {
        Optional<Ingredient> foundIngredient = repo.findById(id);
        if (foundIngredient.isPresent()) {
            return foundIngredient.get();
        } else {
            return null;
        }
    }
    @GetMapping("/ingredients/recipe/{id}")
    public List<Ingredient> getIngredientsByRecipe(@PathVariable Integer id) {
        return repo.findAllIngredientsByRecipeId(id);
    }

    @PostMapping("/ingredients")
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return repo.save(ingredient);
    }

    @PostMapping("/ingredients/id/{id}/recipeId/{recipeId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient addIngredientToRecipe (@PathVariable Integer id, @PathVariable Integer recipeId) {
        Optional<Ingredient> foundIngredient = repo.findById(id);
        if (foundIngredient.isPresent()) {

            Ingredient updateIngredient =  foundIngredient.get();
            updateIngredient.setRecipeId(recipeId);
            return repo.save(updateIngredient);
        } else {
            return null;
        }
    }
    @PutMapping("/ingredients")
    public void updateIngredient(@RequestBody Ingredient ingredient) {
        repo.save(ingredient);
    }

    @DeleteMapping("/ingredients/{id}")
    public void deleteIngredient(@PathVariable Integer id) {
        repo.deleteById(id);
    }

}
