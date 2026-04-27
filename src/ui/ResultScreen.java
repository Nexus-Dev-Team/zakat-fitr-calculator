package ui;

public class ResultScreen extends Screen {

    public void show() {
        displayHeader("Your Results");
        System.out.println("Oops! No results to show, try again please . . .\n");
    }

    public void show(double totalKG, String foodName) {
        displayHeader("Your Results");
        System.out.printf("\t\t\t\tThe total amount: %.2f Kg " + "(" + foodName + ")", totalKG);
        System.out.println('\n');
        line('=');
    }

    public void displayEndMessage() {

        System.out.println("\n* Thanks for using our program");
        System.out.println("* With our team greetings");
        System.out.println("* Copyright (C) is reserved 2026 ");
        System.out.println("* By Nexus Team ");
        
    }
}
