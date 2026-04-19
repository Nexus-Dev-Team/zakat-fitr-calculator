package ui;

public class ResultScreen extends Screen {

    public void show() {
        displayHeader("Your Results");
        System.out.println("Oops! No results to show, try again please . . .\n");
    }

    public void show(double totalKG) {
        displayHeader("Your Results");
        System.out.println("The total amount of the family: " + totalKG + "Kg");
        System.out.println("● Thanks for using our program︎");
        System.out.println("● With our team greetings"); 
        System.out.println("● ©︎opy®︎ight is reserved 2026 ");
        System.out.println("● By Nexus ™︎ ");
    }
}
