import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        // 1 - Basic Arithmetic
        System.out.println("Addition (10, 5): " + addition(10, 5));
        System.out.println("Subtraction (10, 5): " + subtraction(10, 5));
        System.out.println("Multiplication (10, 5): " + multiplication(10, 5));
        System.out.println("Division (10, 5): " + division(10, 5));
        System.out.println("Modulus (10, 6): " + modulus(10, 6));

        // 2 - Create a method that validates that user input is in a certain range
        int userInput = getInteger(1, 10);

        // 3 - Calculate the factorial of a number
        factorial();

        // 4 - Create an application that simulates dice rolling
        diceRoll();

    } // end main()

    // 1 - Basic Arithmetic
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    // 2 - Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("'Within Range' - Enter a number between " + min + " and " + max + ": ");
        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.println(userInput + " is within range of " + min + " and " + max);
        } else {
            getInteger(1, 10);
        }

        return userInput;
    } // end getInteger()

    // 3 - Calculate the factorial of a number
    public static void factorial() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("'Factorial' - Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        long factorialVar = 1;

        if (userInput < 1 || userInput > 10) {
            factorial();
        } else {
            for (int i = 1; i <= userInput; i++) {
                factorialVar = factorialVar * i;
            }
            System.out.println("Factorial of " + userInput + ": " + factorialVar);
        }
    } // end factorial()

    // 4 - Create an application that simulates dice rolling
    public static void diceRoll() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("'Dice Roll' - Enter number of sides for a pair of dice: ");
        int sides = scanner.nextInt();
        int rolls = 1;

        System.out.println("Roll dice?  y / n");
        char rollYesNo = Character.toLowerCase(scanner.next().charAt(0));

        if (rollYesNo == 'n') {
            System.out.println("Game Over");
        } else {
            while (rolls < 3) {
                int rolling = (int) ((Math.random() * (sides - 1)) + 1);
                System.out.println("die " + rolls + ": " + rolling);
                rolls += 1;
            }
        }

        System.out.println("Roll again? y / n");
        rollYesNo = Character.toLowerCase(scanner.next().charAt(0));

        if (rollYesNo == 'n') {
            System.out.println("Game Over");
        } else {
            diceRoll();
        }
    }  // end diceRoll()
}