package ui;
import model.Category;
public class ResultScreen extends screen{

    private double totalKG;
    Category selectedCategory;
    
    public ResultScreen(double totalKG,Category selectedCategory){
        this.totalKG=totalKG;
        this.selectedCategory=selectedCategory;
    }
    public void show(){
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
        System.out.println("● ©︎opy®︎ight is reserved ");
        System.out.println("● By Nexus ™︎ ");

        
    }
    }
}
