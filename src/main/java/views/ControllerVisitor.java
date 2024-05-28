package views;

import controllers.GameController;
import controllers.ResumeController;
import controllers.StartController;

public interface ControllerVisitor {
    void visit(StartController startController);

    void visit(GameController gameController);

    void visit(ResumeController resumeController);
}
