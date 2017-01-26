package rock_scissors_paper;

import static rock_scissors_paper.Roshambo.*;

/**
 * Created by Jeff on 4/01/2017.
 */
public class Lisa extends Player {

    @Override
    public Roshambo generateRoshambo() {
        setPlayerName("Lisa");

        int moveSelection = (int)(Math.random() * 3);

        switch (moveSelection) {
            case 0 : setPlayerMove(ROCK);
                    break;
            case 1 : setPlayerMove(SCISSORS);
                    break;
            case 2 : setPlayerMove(PAPER);
                    break;
        }

        System.out.println(getPlayerName() + " selected :  " + getPlayerMove().toString());
        return getPlayerMove();
    }
}
