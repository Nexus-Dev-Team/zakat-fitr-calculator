package ui;

import consle.ConsoleHelper;

public class MainScreen extends Screen {

    @Override
    public void show() {
        displayHeader("Zakat Fitr Calculator");

        ConsoleHelper.clear();

        System.out.println("===========================================");
        System.out.println("Welcome to the Zakat Fitr Calculator!");
        System.out.println("===========================================");
        System.out.println("\nPress Enter to Start...");
        ConsoleHelper.pause();
    }
}
