package console;

import java.util.Scanner;

public class ConsoleHelper {

    private static Scanner input = new Scanner(System.in);

    public static int readInt() {
        while (!input.hasNextInt()) {
            input.next();
        }
        return input.nextInt();
    }

    public static float readFloat() {
        while (!input.hasNextFloat()) {
            input.next();
        }
        return input.nextFloat();
    }

    public static double readDouble() {
        while (!input.hasNextDouble()) {
            input.next();
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
        }
    }

    public static float readFloatInRange(float min, float max) {
        float number;
        while (true) {
            number = readFloat();
            if (number >= min && number <= max) {
                return number;
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
        }
    }

    public static void pause() {
        // any key have ASCII vlaue 
        try {
            int key;
            while ((key = System.in.read()) != '\n' && key != '\r') {
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