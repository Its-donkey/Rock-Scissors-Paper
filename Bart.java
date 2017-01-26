package rock_scissors_paper;

import static rock_scissors_paper.Roshambo.*;

/**
 * Created by Jeff on 4/01/2017.
 */
public class Bart extends Player {

    @Override
    public Roshambo generateRoshambo() {
        setPlayerName("Bart");
        setPlayerMove(ROCK);

        System.out.println(getPlayerName() + " chooses :  " + getPlayerMove().toString());

        return null;
    }
}
