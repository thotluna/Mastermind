package views;

import controllers.Controller;
import controllers.GameController;
import controllers.ResumeController;
import controllers.StartController;
import views.console.*;

public class ConsoleView implements View
{
    private final WelcomeView welcomeView;
    private final GameView gameView;

    private final ResumeView resumeView;

    public ConsoleView() {
        welcomeView = new WelcomeView();
        gameView = new GameView();
        resumeView = new ResumeView();
    }

    @Override
    public void interact(Controller controller){
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        welcomeView.interact(startController);
    }

    @Override
    public void visit(GameController gameController) {
        gameView.interact(gameController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeView.interact(resumeController);
    }
}
