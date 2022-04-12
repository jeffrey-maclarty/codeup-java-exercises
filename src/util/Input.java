package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input () {
        scanner = new Scanner(System.in);
    }

    public String getString () {
        return scanner.nextLine();
    }

    public boolean yesNo () {
        String userYesNo = scanner.nextLine().toLowerCase();

        if (userYesNo == "y"  || userYesNo == "yes") {
            return true;
        } else {
            return false;
        }

    }

    public int getInt (int min, int max) {



        return 0;
    }
}
