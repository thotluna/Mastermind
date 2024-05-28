package views.console;

import models.Game;

public class GameView {
    private  Game game;
    private final GameHeadView headView;

    private final GameResultView resultView;
    private final PlayerView playerView;

    public GameView() {
        reset();
        headView = new GameHeadView(game);
        resultView = new GameResultView(game);
        playerView = new PlayerView(game);
    }

    private void reset(){
        game = new Game();
    }

    public void interact() {
        do{
            headView.interact();
            playerView.interact();
            game.interact();
        }while (game.isFinished());
        resultView.interact();
    }
}
