package controllers;

import models.Game;
import models.State;
import views.ControllerVisitor;

public class StartController extends Controller {
    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
