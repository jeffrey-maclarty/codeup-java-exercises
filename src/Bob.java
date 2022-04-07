import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob:");
        String userStatement = scanner.nextLine();

        if (userStatement.endsWith("?")) {
            System.out.println("Bob responds 'Sure.'");
        } else if (userStatement.endsWith("!")) {
            System.out.println("Bob responds 'Whoa, chill out!'");
        } else if (userStatement.isEmpty()) {
            System.out.println("Bob responds 'Fine. Be that way!'");
        } else {
            System.out.println("Bob responds 'Whatever.'");
        }

    } // end main
}
