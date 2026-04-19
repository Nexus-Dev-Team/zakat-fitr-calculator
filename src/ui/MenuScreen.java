package ui;

import data.FoodData;

public class MenuScreen extends Screen {

    @Override
    public void show() {

        displayHeader("Available categories");

        for (int i = 0; i < FoodData.getFoodList().size(); i++) {
            System.out.println("\t[" + (i + 1) + "} " + FoodData.getFoodList().get(i).getFoodName());
        }
        
        System.out.println("Enter the number of Category you need😊:");

    }

}
