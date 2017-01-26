package rock_scissors_paper;

/**
 * Created by Jeff on 4/01/2017.
 */
public enum Roshambo {
    ROCK,
    SCISSORS,
    PAPER;

    @Override
    public String toString() {
        String moveString = "";
        if (this.ordinal() == 0)
            moveString = "Rock";
        else if (this.ordinal() == 1)
            moveString = "Scissors";
        else if (this.ordinal() == 2)
            moveString = "Paper";
        return moveString;
    }

}
