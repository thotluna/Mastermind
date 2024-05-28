package models;

import types.ResultAttempt;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Attempts> attempts;
    private Combination secretCombination;
    private Combination proposedCombination;

    public Game() {
       reset();
    }

    public void reset(){
        attempts = new ArrayList<>();
        secretCombination = new Combination();
    }

    public Attempts getLastAttempt(){
        return attempts.get(attempts.size() -1);
    }

    public void interact(){
          ResultAttempt result = secretCombination.compare(proposedCombination);
        attempts.add(new Attempts(attempts.size() + 1, proposedCombination, result.black(), result.white()));
    }


    public void setProposedCombination(Combination combination) {
        proposedCombination = combination;
    }

    public boolean isFinished(){
        return !getLastAttempt().isFinished();
    }

    public int getNumberOfAttempts() {
        return attempts.size();
    }

    public String getSecretCombination(){
        return secretCombination.printWithAsterisk();
    }

    public List<Attempts> getAttempts() {
        return attempts;
    }

    public boolean isWin() {
        return getLastAttempt().isWin();
    }
}
