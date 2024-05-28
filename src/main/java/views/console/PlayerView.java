package views.console;

import models.Combination;
import models.Error;
import models.Game;
import models.Validate;

public class PlayerView extends View {

    public PlayerView(Game game) {
        super(game);
    }

    public void interact() {
        boolean isValid;
        String proposedCombinationString;
        do{
            proposedCombinationString = console.readString(Message.ASK_PROPOSED.toString());
            isValid = validate(proposedCombinationString);
        }while(!isValid);

        game.setProposedCombination(new Combination(proposedCombinationString));
    }

    private boolean validate(String proposedCombination){
        Validate validate = new Validate(proposedCombination);

        if(!validate.isLongCorrect()){
            console.writeError(Error.LENGTH.toString());
            return false;
        }

        if(!validate.matches()){
            console.writeError(Error.NOT_COLOR.toString());
            return false;
        }

        if(!validate.noDuplicate()){
            console.writeError(Error.DUPLICATED.toString());
            return false;
        }
        return true;
    }
}
