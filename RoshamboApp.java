package rock_scissors_paper;

import java.util.Scanner;

/**
 * Created by Jeff on 4/01/2017.
 */
public class RoshamboApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String playersName = "";
        Player player = null;
//        Player player = null;
        int playerMoveValue = 0;
        String playerName = "";

        Player1 humanPlayer = new Player1();
        int humanMoveValue = 0;

        int playerWins = 0;
        int gameDraws = 0;
        int humanWins = 0;

        System.out.print("Welcome to the game of Roshambo\n Enter your name: ");

        playersName = sc.next();
        humanPlayer.setPlayerName(playersName);

        System.out.print("Would you like to play Lisa or Bart? (L/B): ");

        String computerPlayer = sc.next().toUpperCase();

        switch (computerPlayer) {
            case "L": player = new Lisa();
            break;
            case "B": player = new Bart();
            break;
        }

        String play;

        do{
            humanPlayer.generateRoshambo();
            humanMoveValue = humanPlayer.getMoveValue(humanPlayer.getPlayerMove());

            if(computerPlayer.equals("L")) {
                player.generateRoshambo();
                playerMoveValue = humanPlayer.getMoveValue(player.getPlayerMove());
                playerName = player.getPlayerName();
            } else if (computerPlayer.equals("B")) {
                player.generateRoshambo();
                playerMoveValue = humanPlayer.getMoveValue(player.getPlayerMove());
                playerName = player.getPlayerName();
            }

            if(humanMoveValue > playerMoveValue) {
                System.out.println(humanPlayer.getPlayerName() + " wins!");
                humanWins++;
            } else if (humanMoveValue == playerMoveValue) {
                System.out.println("Draw!");
                gameDraws++;
            } else if (humanMoveValue < playerMoveValue) {
                System.out.println(playerName + " wins!");
                playerWins++;
            }


            System.out.print("Would you like to play again? [Y/N] :  ");
            play = sc.next();
        }while(play.equalsIgnoreCase("y"));




    }
}
