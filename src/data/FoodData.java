package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Category;

public class FoodData {
    private static ArrayList<Category> foodList = new ArrayList<>(); 
    
    static {
        foodList.add(new Category("Rice" , 2.3));
        foodList.add(new Category("Flour" , 2.0));
        foodList.add(new Category("Lentils" , 2.1));
        foodList.add(new Category("Wheat" , 2.040));
    }

    public static List<Category> getFoodList() {
        return Collections.unmodifiableList(foodList);
    }
}
