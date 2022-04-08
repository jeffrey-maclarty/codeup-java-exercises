import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        converse(getInput());

    } // end main

    public static String getInput () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob:");
        return scanner.nextLine();
    }

    public static void converse(String userStatement) {
        if (userStatement.endsWith("?")) {
            System.out.println("Bob responds 'Sure.'");
        } else if (userStatement.endsWith("!")) {
            System.out.println("Bob responds 'Whoa, chill out!'");
        } else if (userStatement.isEmpty()) {
            System.out.println("Bob responds 'Fine. Be that way!'");
        } else {
            System.out.println("Bob responds 'Whatever.'");
        }
    }
}