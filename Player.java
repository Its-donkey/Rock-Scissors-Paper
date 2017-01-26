package rock_scissors_paper;

/**
 * Created by Jeff on 4/01/2017.
 */
public abstract class Player {

    private String playerName = "";
    private Roshambo playerMove;
    private int rockValue;
    private int paperValue;
    private int scissorValue;

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerMove(Roshambo playerMove) {
        this.playerMove = playerMove;

        switch(playerMove) {
            case ROCK:
                this.rockValue = 0;
                this.paperValue = 1;
                this.scissorValue = -1;
                break;
            case PAPER:
                this.rockValue = -1;
                this.paperValue = 0;
                this.scissorValue = 1;
                break;
            case SCISSORS:
                this.rockValue = 1;
                this.paperValue = -1;
                this.scissorValue = 0;
                break;
        }

    }

    public Roshambo getPlayerMove() {
        return playerMove;
    }





    public int getMoveValue(Roshambo playerMove) {

        int value = 0;

        switch(playerMove) {
            case ROCK:
                value = this.rockValue;
                break;
            case PAPER:
                value = this.paperValue;
                break;
            case SCISSORS:
                value = this.scissorValue;
                break;
        }
        return value;
    }

    public abstract Roshambo generateRoshambo();
}
