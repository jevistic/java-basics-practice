import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("While and Do while");

        //while loop

        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        //infinite loop
//        while (true){
//            System.out.println("This will always execute infinitely!");
//        }


        //Practice    NumberGuessing Game

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 51;
        int upperBound = 100;

//        int randomNumber = random.nextInt(upperBound) + lowerBound;

        int randomNumber = random.nextInt(upperBound-lowerBound+1) + lowerBound;
        System.out.println(randomNumber);

        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            numberOfGuesses++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly.");
                System.out.println("It took you " + numberOfGuesses + " guesses.");
            }
            else if (userGuess < randomNumber) {
                System.out.println("Try higher.");
            }
            else {
                System.out.println("Try lower.");
            }
        }




        //Do-While loop

        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);


        //example    secret number
        int secretNumber = 42;
        int userGuess;

        do {
            System.out.print("Guess the secret number: ");
            userGuess = sc.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Try a lower number.");
            }
        } while (userGuess != secretNumber);

        System.out.println("Congratulations! You guessed the secret number.");
    }
}