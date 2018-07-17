import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// I'm thinking of a number. Guess it. If you've ever played that game or some version of it you're ready for the next assignment.
// The computer will "pick" a number. Actually, you'll program one in the code. You can use a random number if you're ambitious.
//
//Create a number-guessing game using a while-loop. The loop will allow users to guess until they get the number right.
// Your program will keep looping as long as the guess is different from the secret number.
//
//The output should look like this: (Secret number = 6)
//
//I have chosen a number between 1 and 10. Try to guess it.
//Your guess: 5
//That is incorrect. Guess again.
//Your guess: 8
//That is incorrect. Guess again.
//Your guess: 6
//That's right! You're a good guesser.
        Scanner sca = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter number");
        int guess = sca.nextInt();

        int num = 1 + rand.nextInt(10);

        // intialization
        while (guess != num) {
            //System.out.println("Enter number");
            System.out.println("That is incorrect. Guess again.");
            //int gusse = sca.nextInt();
            guess = sca.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
    }


}


