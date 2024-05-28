package controllers;

import models.Game;
import models.State;
import views.ControllerVisitor;

public abstract class Controller {
    protected final Game game;
    protected final State state;

    protected Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

    public void next() {
        this.state.next();
    }
}
