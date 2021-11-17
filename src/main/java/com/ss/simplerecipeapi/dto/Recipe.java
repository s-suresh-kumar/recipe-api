package com.ss.simplerecipeapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitilizer", "handler"})
@Table(name="recipe")
public class Recipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recipeId;
    private String title;
    private String category;
    private String prepTime;
    private String cookTime;
    @Column(length = 3000)
    private String directions;
    private Integer servings;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createdDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updatedDate;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "recipeId")
    private Set<Ingredient> ingredients = new HashSet<>();

    public Recipe() {
    }

//    public Recipe(Integer recipeId, String title, String category, String prepTime, String cookTime, String directions, Integer servings, Date createdDate, Date updatedDate, Set<Ingredient> ingredients) {
//        this.recipeId = recipeId;
//        this.title = title;
//        this.category = category;
//        this.prepTime = prepTime;
//        this.cookTime = cookTime;
//        this.directions = directions;
//        this.servings = servings;
//        this.createdDate = createdDate;
//        this.updatedDate = updatedDate;
//        this.ingredients = ingredients;
//    }

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeId, recipe.recipeId) && Objects.equals(title, recipe.title) && Objects.equals(category, recipe.category) && Objects.equals(prepTime, recipe.prepTime) && Objects.equals(cookTime, recipe.cookTime) && Objects.equals(directions, recipe.directions) && Objects.equals(servings, recipe.servings) && Objects.equals(createdDate, recipe.createdDate) && Objects.equals(updatedDate, recipe.updatedDate) && Objects.equals(ingredients, recipe.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, title, category, prepTime, cookTime, directions, servings, createdDate, updatedDate, ingredients);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", prepTime='" + prepTime + '\'' +
                ", cookTime='" + cookTime + '\'' +
                ", directions='" + directions + '\'' +
                ", servings=" + servings +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", ingredients=" + ingredients +
                '}';
    }
}
