package ui;

import java.util.List;
import model.Category;

public class MenuScreen extends Screen {

    private List<Category> foodList;

    MenuScreen(List<Category> foodList) {
        this.foodList = foodList;
    }

    @Override
    public void show() {
        System.out.println("Available categories: ");

        printList();

        System.out.println();
        line('=');
        System.out.println();
        System.out.print("Enter the number of Category you need😊:");

    }

    private void printList() {

        for (int i = 0; i < foodList.size(); i++) {
            System.out.print("[" + (i + 1) + "- " + "Name: " + foodList.get(i).getFoodName());
            System.out.print(" --> Kilo per sa3: " + foodList.get(i).getKiloPerSa3() + "]");
            System.out.println();
        }
    }
}
