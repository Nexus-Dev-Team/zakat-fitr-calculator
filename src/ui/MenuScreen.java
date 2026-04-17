package ui;
import java.util.List;
import model.Category;


public class MenuScreen extends Screen {

   private List<Category> foodList;
   private String title = "Available categories";

  public  MenuScreen(List<Category> foodList) {
        this.foodList = foodList;
    }

    @Override
    public void show() {

        displayHeader(title);

        for (int i = 0; i < foodList.size(); i++) {
            System.out.println("[" + (i + 1) + "- " + foodList.get(i).getFoodName() + "]");
        }

        line('=');

        System.out.print("Enter the number of Category you need😊:");

    }

}
