package ui;

import java.util.List;
import model.Category;
import data.FoodData;

public class MenuScreen extends Screen {

    private String title = "Available categories";

    @Override
    public void show() {

        displayHeader(title);

        for (int i = 0; i < FoodData.foodList.size(); i++) {
            System.out.println("[" + (i + 1) + "- " + FoodData.foodList.get(i).getFoodName() + "]");
        }

        line('=');

        System.out.print("Enter the number of Category you need😊:");

    }

}
