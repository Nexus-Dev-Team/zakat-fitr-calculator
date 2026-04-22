package controller;

import service.ZakatService;
import model.Category;
import console.ConsoleHelper;
import ui.*;
import data.FoodData;

public class AppController {

    public static void run() {
        showWelcomeScreen();
        boolean shouldContinue;
        do {
            processZakatCycle();
            System.out.println();
            System.out.print("Do you want to try again? (1: Yes / 2: No): ");
            shouldContinue = (ConsoleHelper.readIntInRange(1, 2) == 1);
        } while (shouldContinue);

        new ResultScreen().displayEndMessage();
        ConsoleHelper.closeScanner();
    }

    private static void showWelcomeScreen() {
        // ** welcome screen **
        ConsoleHelper.clear();
        new MainScreen().show();
        ConsoleHelper.pause();
    }

    private static void processZakatCycle() {
        // ** Read number of family members **
        ConsoleHelper.clear();
        new InputScreen().show();
        int familyMembers = ConsoleHelper.readInt();

        // ** show food category menu **
        ConsoleHelper.clear();
        new MenuScreen().show();
        int choice = ConsoleHelper.readIntInRange(1, FoodData.getFoodList().size());

        // **Calculate total zakat weight after know the value of kiloPerPerson for choosen category**
        Category selected = FoodData.getFoodList().get(choice - 1);
        double totalKg = ZakatService.calculate(familyMembers, selected.getKiloPerPerson());

        // ** Show result **
        ConsoleHelper.clear();
        new ResultScreen().show(totalKg, selected.getFoodName());
    }

}