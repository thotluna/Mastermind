package views;

import views.console.GameView;
import views.console.Message;
import views.console.WelcomeView;
import views.console.YesNotView;

public class ConsoleView implements View
{
    private final WelcomeView welcomeView;
    private final GameView gameView;
    private final YesNotView yesNotView;

    public ConsoleView() {
        this.welcomeView = new WelcomeView();
        this.gameView = new GameView();
        this.yesNotView = new YesNotView(Message.RESUME.toString());
    }

    @Override
    public void interact(){
        do {
            welcomeView.interact();
            gameView.interact();
        }while (yesNotView.isAffirmative());
    }
}
