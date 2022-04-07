import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        // 1a
        // Create an integer variable i with a value of 5.
//        int i = 5;

        // Create a while loop that runs so long as i is less than or equal to 15
        // Each loop iteration, output the current value of i, then increment i by one.
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // 1b
        // Create a do-while loop that will count by 2's starting with 0 and ending at
        // 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each
        // line while the number is less than 1,000,000.
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

        // 1c
        // Refactor the previous two exercises to use a for loop instead.
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        // 2 - Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + " FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println(i + " Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 3 - Display a table of powers.
        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
        // Ask if the user wants to continue.
        // Assume that the user will enter valid data.
        // Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would like to go up to? ");
        int userInt = scanner.nextInt();

        System.out.println("Here is your table!");
        System.out.println("");
        String tableAlignment = "| %-8s | %-9s | %-7s |%n";
        System.out.println("| number   | squared   | cubed   |");
        System.out.println("| -------- | --------- | ------- |");
        for (int i = 1; i <= userInt; i++) {
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf(tableAlignment, i, squared, cubed);
        }

    } // end main
}
