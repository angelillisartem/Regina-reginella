import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creare un oggetto Scanner per leggere l'input dell'utente
        Scanner input = new Scanner(System.in);

        // Crea un oggetto Random per generare numeri casuali
        Random rand = new Random();

        // Chiedi all'utente quanti giocatori stanno giocando
        System.out.print("Quanti giocatori stanno giocando?: ");
        int numGiocatori = input.nextInt();

        // Crea una serie di animali tra cui scegliere
        String[] animali = {"Elefante", "Formica", "Canguro", "Ghiro", "Gambero", "Cavallo"};

        // Gioca il gioco per ogni giocatore
        for (int giocatore = 1; giocatore <= numGiocatori; giocatore++) {
            // Chiedi al giocatore quanti passi fare
            System.out.print("Giocatore " + giocatore + ", quanti passi vuoi fare?: ");
            int passi = input.nextInt();

            // Genera un numero casuale di passaggi e animali
            int numPassi = rand.nextInt(6) + 1;
            String animale = animali[rand.nextInt(animali.length)];

            // Stampa il risultato
            System.out.print("La regina dice di prendere " + numPassi + " passi e incontrare a " + animale + ".");
        }
    }
}
