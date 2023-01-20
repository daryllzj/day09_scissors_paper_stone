package sdf;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Integer computerChoice, playerChoice;

        String winner = "";

        Scanner scanner = new Scanner(System.in);

        SSP ssp = new SSP();
        computerChoice = ssp.generateRandChoice();

        while (winner.equals("")) {
            System.out.println("1) Scissors, 2) Paper, 3) Stone");
            playerChoice = scanner.nextInt();

            if (!((playerChoice >=1)&& (playerChoice <=3))) {
                System.out.println("invalid input");
                continue;
            }

            winner = ssp.checkWinner(playerChoice, computerChoice);
            if (winner.equalsIgnoreCase("")) {
                System.out.println();
            } else {
                System.out.println(winner + " wins.");
            }
            
        }

        scanner.close();


    }
}
