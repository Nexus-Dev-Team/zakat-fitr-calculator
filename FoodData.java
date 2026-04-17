import java.util.ArrayList;
import java.util.Locale.Category;

public class FoodData {
    private  ArrayList<Category> foodList; 
    
    public FoodData(){
    foodList = new ArrayList<>();
    foodList.add(new Category("Rice" , 2.3));
    foodList.add(new Category("Flour" , 2.0));
    foodList.add(new Category("Lentils" , 2.1));
    foodList.add(new Category("Wheat" , 2.040));
    }

    private  ArrayList<Category> getFoodData(){
        return foodList;
    }
    public void setFoodData(ArrayList<Category> foodList){
    this.foodList = foodList;
    }
    }
