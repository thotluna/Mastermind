package views;

public class ConsoleView {
    private final WelcomeView welcomeView;
    private final GameView gameView;
    private final YesNotView yesNotView;

    public ConsoleView() {
        this.welcomeView = new WelcomeView();
        this.gameView = new GameView();
        this.yesNotView = new YesNotView(Message.RESUME.toString());
    }

    public void interact(){
        do {
            welcomeView.interact();
            gameView.interact();
        }while (yesNotView.isAffirmative());
    }
}
