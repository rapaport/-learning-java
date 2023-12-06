import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("This is a little fun number guessing game.");

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100)+1;  // without +1 would be between 0 and 99

        int tryCount = 0;

        while(true) {

            System.out.println("Enter your guess between 1 and 100:");

            int playerGuess = scanner.nextInt();
            tryCount ++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win! It took you " + tryCount + " tries. Well done!");
                break;
            }

            else if (randomNumber > playerGuess) {
                System.out.println("The number is larger than your guess.");
            }

            else {
                System.out.println("The number is smaller than your guess.");
            }

        }





    }
}