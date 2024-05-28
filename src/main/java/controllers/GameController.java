package controllers;

import models.*;
import models.Error;
import views.ControllerVisitor;

import java.util.List;

public class GameController extends Controller {
    public GameController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public int getNumberOfAttempts(){
        return game.getNumberOfAttempts();
    }

    public String getSecretCombination(){
        return game.getSecretCombination();
    }

    public List<Attempts> getAttempts(){
        return game.getAttempts();
    }

    public void setProposedCombination(String combination){
        game.setProposedCombination(new Combination(combination));
    }

    public void interact(){
        game.interact();
    }

    public boolean finished() {
        return game.isFinished();
    }

    public boolean isWin() {
        return game.isWin();
    }

    public String validate(String combinationString){
        Validate validate = new Validate(combinationString);

        if(!validate.isLongCorrect()){
            return Error.LENGTH.toString();
        }

        if(!validate.matches()){
            return Error.NOT_COLOR.toString();
        }

        if(!validate.noDuplicate()){
            return Error.DUPLICATED.toString();
        }
        return "";
    }
}
