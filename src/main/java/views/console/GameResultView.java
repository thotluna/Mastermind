package views.console;

import controllers.GameController;
import utils.Console;

public class GameResultView extends PrintView {

    public void interact(GameController gameController) {
        if(gameController.isWin()){
            console.writeln(Message.WON.toString());
        }else {
            console.writeln(Message.LOSER.toString());
        }
    }
}
