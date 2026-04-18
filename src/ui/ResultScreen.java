package ui;
import model.Category;
public class ResultScreen extends screen{

    public void show(){
        headerDisplay();
        System.out.println("◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼︎");
        System.out.println("◼•"+"          Your inputs     "+   "•◼");
        System.out.println("◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼︎");
        System.out.println("food type:" +selectedCategory.getname());
        System.out.println("Amount of each person:" +selectedCategory.getkgPerPerson());
        System.out.println("\n\n∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷\n\n︎");
        System.out.println("◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼︎");
        System.out.println("◼•"+"          Your Result     "+  "•◼");
        System.out.println("◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼•◼︎");
        System.out.println("The total amount of the family:"+ totalKG +"Kg");
        System.out.println("\n\n∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷\n\n︎");
        System.out.println("● Thanks for using our program︎");
        System.out.println("● With our team greetings"); 
        System.out.println("● ©︎opy®︎ight is reserved 2026 ");
        System.out.println("● By Nexus ™︎ ");

        
    }
    }
}
