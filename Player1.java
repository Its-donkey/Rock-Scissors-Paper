package rock_scissors_paper;

import java.util.Scanner;

import static rock_scissors_paper.Roshambo.*;

/**
 * Created by Jeff on 4/01/2017.
 */
public class Player1 extends Player {

    Scanner sc = new Scanner(System.in);

    Validator validate = new Validator();

    @Override
    public Roshambo generateRoshambo() {

        String move = "";
        Roshambo moveSelection;
        while (!validate.isValidMove(move)) {
            System.out.print("Rock, paper, or scissors? (R/P/S): ");

            move = sc.next();
        }

        move = move.toUpperCase();

            switch (move) {
                case "R":
                    setPlayerMove(ROCK);
                    break;
                case "P":
                    setPlayerMove(PAPER);
                    break;
                case "S":
                    setPlayerMove(SCISSORS);
                    break;

            }

            System.out.println(getPlayerName() + " selected :  " + getPlayerMove().toString());

            return getPlayerMove();
    }
}
