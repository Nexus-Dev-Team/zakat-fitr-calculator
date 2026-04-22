package ui;

import data.FoodData;

public class MenuScreen extends Screen {

    @Override
    public void show() {

        displayHeader("Available categories");
        
        var foods = FoodData.getFoodList();
        for (int i = 0; i <foods.size(); i++) {
            System.out.println("\t[" + (i + 1) + "] " + foods.get(i).getFoodName());
        }

        System.out.println();
        line('=');
        
        System.out.println("\nEnter the number of Category you need:");

    }

}
