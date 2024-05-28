package views;

import models.Game;

public class GameResultView extends View {

    public GameResultView(Game game) {
        super(game);
    }

    public void interact() {
        if(game.isWin()){
            console.writeln(Message.WON.toString());
        }else {
            console.writeln(Message.LOSER.toString());
        }
    }
}
