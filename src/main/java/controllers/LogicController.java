package controllers;

import models.Game;
import models.State;
import types.StateType;

import java.util.HashMap;
import java.util.Map;

public class LogicController {

    private final Map<StateType, Controller> controllers;
    private final State state;

    public LogicController() {
        state = new State();
        Game game = new Game();

        controllers = new HashMap<>();
        controllers.put(StateType.INIT, new StartController(game, state));
        controllers.put(StateType.GAME, new GameController(game, state));
        controllers.put(StateType.RESUME, new ResumeController(game, state));
        controllers.put(StateType.IS_NULL, null);
    }

    public Controller getController(){
        return this.controllers.get(state.getValue());
    }

    public boolean isFinished(){
        return state.isFinished();
    }
}
