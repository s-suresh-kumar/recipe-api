package com.ss.simplerecipeapi.repository;

import com.ss.simplerecipeapi.dto.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    List<Ingredient> findAllIngredientsByRecipeId(Integer recipeId);
}
