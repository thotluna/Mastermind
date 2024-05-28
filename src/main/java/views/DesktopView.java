package views;

import controllers.Controller;
import controllers.GameController;
import controllers.ResumeController;
import controllers.StartController;

public class DesktopView implements View {

    @Override
    public void visit(StartController startController) {
        System.out.println("Star Controller");
    }

    @Override
    public void visit(GameController gameController) {
        System.out.println("Game Controller");
    }

    @Override
    public void visit(ResumeController resumeController) {
        System.out.println("ResumeController");
    }

    @Override
    public void interact(Controller controller) {
        System.out.println("Controller");
    }
}
