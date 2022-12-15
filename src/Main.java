import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the user
        Scanner input = new Scanner(System.in);

        // Create a Random object for generating random numbers
        Random rand = new Random();

        // Ask the user how many players are playing
        System.out.println("How many players are playing?");
        int numGiocatori = input.nextInt();

        // Create an array of animals to choose from
        String[] animali = {"cat", "dog", "bird", "snake", "tiger", "lion"};

        // Play the game for each player
        for (int giocatore = 1; giocatore <= numGiocatori; giocatore++) {
            // Ask the player how many steps to take
            System.out.println("Player " + giocatore + ", how many steps do you want to take?");
            int passi = input.nextInt();

            // Generate a random number of steps and animal
            int numPassi = rand.nextInt(6) + 1;
            String animale = animali[rand.nextInt(animali.length)];

            // Print the result
            System.out.println("The queen says to take " + numPassi + " steps and meet a " + animale + ".");
        }
    }
}
