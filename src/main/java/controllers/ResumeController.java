package controllers;

import models.Game;
import models.State;
import views.ControllerVisitor;

public class ResumeController extends Controller {
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void reset() {
        state.reset();
        game.reset();
    }
}
