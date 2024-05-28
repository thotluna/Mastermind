package views;

import controllers.Controller;

public interface View extends ControllerVisitor {
    void interact(Controller controller);
}
