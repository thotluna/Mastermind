import views.DesktopView;
import views.View;

public class MastermindDesktop extends Mastermind {
    @Override
    public View createView() {
        return new DesktopView();
    }

    public static void main(String[] args) {
        new MastermindDesktop().play();
    }
}
