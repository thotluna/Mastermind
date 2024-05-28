package views.console;

import controllers.GameController;

public class GameView {

    private final GameHeadView headView;

    private final GameResultView resultView;
    private final PlayerView playerView;

    public GameView() {
        headView = new GameHeadView();
        resultView = new GameResultView();
        playerView = new PlayerView();
    }

    public void interact(GameController gameController) {
        do{
            headView.interact(gameController);
            playerView.interact(gameController);
            gameController.interact();
        }while (gameController.finished());
        resultView.interact(gameController);
        gameController.next();

    }
}
