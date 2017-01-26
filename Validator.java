package rock_scissors_paper;

import java.util.regex.Pattern;

/**
 * Created by Jeff on 7/01/2017.
 */
public class Validator {

    public boolean isValidMove(String character) {
        Pattern isACharacter = Pattern.compile("^r|s|p$", Pattern.CASE_INSENSITIVE);
        return isACharacter.matcher(character).matches();
    }




}
