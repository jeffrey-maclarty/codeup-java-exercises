package util;

import java.util.Scanner;

public class InputRy {

    private Scanner scanner;

    public InputRy () {
        this.scanner = new Scanner(System.in);
    }

    public String getString (String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo (String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.next();
        if (userInput.equalsIgnoreCase("y") || (userInput.equalsIgnoreCase("yes"))) {
            return true;
        } else {
            return false;
        }

    }

    public int getInt (int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max + ": ");
        int userInput = this.scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt () {
        return this.scanner.nextInt();
    }

        public double getDouble (double min, double max) {
        System.out.println("Enter an integer between " + min + " and " + max + ": ");
        int userInput = this.scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public int getDouble(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextInt();
    }



}
