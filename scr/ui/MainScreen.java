package ui;

import consle.ConsoleHelper;

public class MainScreen extends Screen {

    @Override
    public void show() {
        ConsoleHelper.clear();
        
        displayHeader("Zakat Fitr Calculator");

        System.out.println("===========================================");
        System.out.println("Welcome to the Zakat Fitr Calculator!");
        System.out.println("===========================================");
        
        ConsoleHelper.pause();
    }
}
