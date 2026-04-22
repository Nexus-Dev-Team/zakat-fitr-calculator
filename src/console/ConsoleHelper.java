package console;

import java.util.Scanner;

public class ConsoleHelper {

    private static Scanner input = new Scanner(System.in);

    //
    public static int readInt() {
        while (true) {
            try {
                int number = Integer.parseInt(input.nextLine().trim());
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please , Enter number greater than 0 ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid value, Please enter integer number.");
            }
        }
    }

    public static float readFloat() {
        while (true) {
            try {
                float number = Float.parseFloat(input.nextLine().trim());
                if (number > 0)
                    return number;
                else
                    System.out.println("Please enter a number greater than 0.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid value, please enter a decimal number.");
            }
        }
    }

    public static double readDouble() {
        while (true) {
            try {
                double number = Double.parseDouble(input.nextLine().trim());
                if (number > 0)
                    return number;
                else
                    System.out.println("Please enter a number greater than 0.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid value, please enter a decimal number.");
            }
        }
    }

    public static int readIntInRange(int min, int max) {
        int number;
        while (true) {
            number = readInt();
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("Invalid value, Please enter integer number from " + min + " to " + max + ".");
            }
        }
    }

    public static float readFloatInRange(float min, float max) {
        float number;
        while (true) {
            number = readFloat();
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("Invalid value, Please enter decimal number from " + min + " to " + max + ".");
            }
        }
    }

    public static double readDoubleInRange(double min, double max) {
        double number;
        while (true) {
            number = readDouble();
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("Invalid value, Please enter decimal number from " + min + " to " + max + ".");
            }
        }
    }

    public static void pause() {
        System.out.println("Press \"Enter\" to continue...");
        input.nextLine();
    }

    public static void clear() {
        String os = System.getProperty("os.name");
        try {
            /*
             * ProcessBuilder: used to run external system commands from Java
             * 
             * 1) "cmd /c" :
             * open command prompt, execute the given command, then terminate
             * 
             * 2) inheritIO():
             * makes the new process use the same console (input/output) as this Java
             * program
             * 
             * 3) start():
             * starts the process (runs the command)
             * 
             * 4) waitFor():
             * makes the program wait until the process finishes execution
             * 
             * Note:
             * the program creates a system process, runs the command inside it,
             * displays the result in the same console, waits for it to finish,
             * then continues execution
             */
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // for Linux and MacOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // e.printStackTrace();

            // print 50 lines as a simulation of the "clear" function
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    public static void closeScanner() {
        input.close();
    }
}