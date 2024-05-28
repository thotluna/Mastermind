package views.console;

import controllers.GameController;
import models.Attempts;
import utils.Console;

public class GameHeadView extends PrintView {

    public void interact(GameController gameController) {
        console.writeln("\n");
        console.writeln(Message.ATTEMPTS.toString(), gameController.getNumberOfAttempts());
        console.writeln(gameController.getSecretCombination());

        for(Attempts attempt: gameController.getAttempts()){
            console.writeln(Message.ATTEMPT.toString(), attempt.getProposedCombination().toString(),
                    attempt.getBlack(), attempt.getWhite() );
        }
    }
}
