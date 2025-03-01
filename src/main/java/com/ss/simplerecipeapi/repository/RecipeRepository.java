package com.ss.simplerecipeapi.repository;

import com.ss.simplerecipeapi.dto.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    List<Recipe> findAllRecipesByCategory(String category);
}
