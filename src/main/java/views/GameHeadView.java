package views;

import models.Attempts;
import models.Game;

public class GameHeadView extends View {

    public GameHeadView(Game game) {
        super(game);
    }

    public void interact() {
        console.writeln("\n");
        console.writeln(Message.ATTEMPTS.toString(), game.getNumberOfAttempts());
        console.writeln(game.getSecretCombination());

        for(Attempts attempt: game.getAttempts()){
            console.writeln(Message.ATTEMPT.toString(), attempt.getProposedCombination().toString(),
                    attempt.getBlack(), attempt.getWhite() );
        }
    }
}
