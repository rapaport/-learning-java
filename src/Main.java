import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("This is a little fun number guessing game.");

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100)+1;  // without +1 would be between 0 and 99
        System.out.println("Enter your guess!");

        int playerGuess = scanner.nextInt();

        if(playerGuess == randomNumber) {
            System.out.println("Correct! You win!");
        }
        else if(randomNumber > playerGuess) {
            System.out.println("The number is larger than your guess.");
        }
        else if(randomNumber < playerGuess) {
            System.out.println("The number is smaller than your guess.");
        }
        else {
            System.out.println("Sorry, something went wrong.");
        }




    }
}