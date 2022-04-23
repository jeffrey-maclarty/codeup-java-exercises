package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    private int min;
    private int max;
    private int userInt;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string:");
        String userGetString = scanner.nextLine();
        System.out.println("From Input class, getString(): " + userGetString);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or no?");
        String userYesNo = scanner.nextLine().toLowerCase();

        if (userYesNo == "y" || userYesNo == "yes") {
            return true;
        } else {
            return false;
        }

    }

    public int getInt(int min, int max) {
        System.out.println("Enter a minimum int:");
        min = scanner.nextInt();
        System.out.println("Enter a minimum int:");
        max = scanner.nextInt();




        return 0;
    }

    public int getInt(int userInt) {
        System.out.println("Enter a number between " + min + " and " + max + ":");
        userInt = scanner.nextInt();
        if (userInt < max && userInt > min) {
            System.out.println(userInt + " is between " + min + " and " + max);
        } else {
            getInt(userInt);
        }




        return 0;
    }
}
