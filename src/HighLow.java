import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte randomNumber = (byte) ((Math.random() * (100 - 1)) + 1);
        byte userGuess = 0;
        byte numberOfGuesses = 0;

        while (userGuess != randomNumber && numberOfGuesses < 20) {
            System.out.println("Try to guess the number '1 - 100': ");
            userGuess = scanner.nextByte();
            if (userGuess == randomNumber) {
                System.out.print("Correct! " + userGuess + " is the correct number.");
                userGuess = randomNumber;
            } else if (userGuess > randomNumber) {
                System.out.println("Wrong! " + userGuess + " is too high, try a lower number.");
            } else {
                System.out.println("Wrong! " + userGuess + " is too low, try a higher number.");
            }
            numberOfGuesses += 1;
            System.out.println("That was guess " + numberOfGuesses + " of 20 allowed.");
        }
//        System.out.println(randomNumber);
    }
}
