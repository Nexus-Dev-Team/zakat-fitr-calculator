package ui;

import java.util.Scanner;

public class MainScreen extends Screen {

    public MainScreen() {
    }

    @Override
    public void show() {
        System.out.println("================================");
        System.out.println("Welcome to the Zakat Fitr Calculator!");
        System.out.println("================================");
        System.out.println("\nPress Enter to Start...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
