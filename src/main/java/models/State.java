package models;

import types.StateType;

public class State {
    private StateType value;

    public State() {
        reset();
    }

    public void reset() {
        value = StateType.INIT;
    }

    public StateType getValue() {
        return value;
    }

    public void next(){
        value = StateType.values()[value.ordinal() + 1];
    }

    public boolean isFinished(){
        return value == StateType.IS_NULL;
    }

}
