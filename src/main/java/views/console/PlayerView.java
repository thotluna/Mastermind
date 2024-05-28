package views.console;

import controllers.GameController;

public class PlayerView extends PrintView {

    public void interact(GameController gameController) {
        boolean isValid;
        String proposedCombinationString;
        do{
            isValid = true;
            proposedCombinationString = console.readString(Message.ASK_PROPOSED.toString());
            String error = gameController.validate(proposedCombinationString);
            if(!error.isBlank()){
                console.writeError(error);
                isValid = false;
            }
        }while(!isValid);

        gameController.setProposedCombination(proposedCombinationString);
    }
}
