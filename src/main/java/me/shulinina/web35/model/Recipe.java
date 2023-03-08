package me.shulinina.web35.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
@Data
@AllArgsConstructor
public class Recipe {//класс описывает рецепты
    private String name;
    private int cookingTime;
    private List<Ingredient> ingredients;
    private LinkedList<String> steps;
    private Map<Long, Recipe>recipes;
}