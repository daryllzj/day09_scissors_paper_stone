package sdf;

import java.util.Random;

public class SSP {

    public Integer generateRandChoice() {

        Random rand = new Random();

        Integer choice = rand.nextInt(3);

        return choice;
        
    }

    public String checkWinner(Integer playerChoice, Integer computerChoice) {

        playerChoice = playerChoice -1;
        String winner = "";

        if (playerChoice.equals(computerChoice)) {
            System.out.println("Tie");
            return "";
        }

        switch (playerChoice) {
            case 0:
                if (computerChoice ==1) {
                    winner = "player";
                } else {
                    winner = "computer";
                }
                break;
            case 1:
                if (computerChoice == 2) {
                    winner = "player";
                } else {
                    winner = "computer";
                }
                break;
            case 2:
                if (computerChoice == 0) {
                    winner = "player";
                } else {
                    winner = "computer";
                }
                break;
        }

        return winner;
        
    }
    
}
