package console;

import java.util.Scanner;

public class ConsoleHelper {

    private static Scanner input = new Scanner(System.in);

    public static int readInt() {
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid value, Please enter integer number.");
        }
        return input.nextInt();
    }

    public static float readFloat() {
        while (!input.hasNextFloat()) {
            input.next();
            System.out.println("Invalid value, Please enter decimal number.");

        }
        return input.nextFloat();
    }

    public static double readDouble() {
        while (!input.hasNextDouble()) {
            input.next();
            System.out.println("Invalid value, Please enter decimal number.");

        }
        return input.nextDouble();
    }

    public static int readIntInRange(int min, int max) {
        int number;
        while (true) {
            number = readInt();
            if (number >= min && number <= max) {
                return number;
            }
            else 
            {
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
            }
            else
            {
            System.out.println("Invalid value, Please enter decimal number from " + min + " to " + max + "." );
            }
        }
    }

    public static double readDoubleInRange(double min, double max) {
        double number;
        while (true) {
            number = readDouble();
            if (number >= min && number <= max) {
                return number;
            }
            else
            {
            System.out.println("Invalid value, Please enter decimal number from " + min + " to " + max + "." );
            }
        }
    }

    public static void pause() {
        try {
            // any key on keyboard have ASCII vlaue 
            int ch;
            while ((ch = System.in.read()) != '\n' && ch != '\r') {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            e.printStackTrace();
        }
    }
}