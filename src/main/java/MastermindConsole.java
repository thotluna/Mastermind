import views.ConsoleView;
import views.DesktopView;
import views.View;

public class MastermindConsole extends Mastermind {

    @Override
    public View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }
}
