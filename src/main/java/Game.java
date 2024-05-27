import types.ResultAttempt;
import utils.Console;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Attempts> attempts;
    private final Combination secretCombination;
    private final Console console;

    public Game() {
        attempts = new ArrayList<>();
        secretCombination = new Combination();
        console = Console.getInstance();
    }

    public void start() {
        do{
            printStart();
            interact();
        }while (!getLastAttempt().isFinished());
        printResult();
    }

    private Attempts getLastAttempt(){
        return attempts.get(attempts.size() -1);
    }

    private void printStart(){
        console.writeln("\n");
        console.writeln(Message.ATTEMPTS.toString(), attempts.size());
        console.writeln(secretCombination.printWithAsterisk());

        for(Attempts attempt: attempts){
            console.writeln(Message.ATTEMPT.toString(), attempt.getProposedCombination().toString(),
                    attempt.getBlack(), attempt.getWhite() );
        }
    }

    private void interact(){
        Combination proposedCombination = getProposedCombination();
        ResultAttempt result = secretCombination.compare(proposedCombination);
        attempts.add(new Attempts(attempts.size() + 1, proposedCombination, result.black(), result.white()));
    }

    private Combination getProposedCombination(){
        boolean isValid = true;
        String proposedCombinationString;
        do{
            proposedCombinationString = console.readString(Message.ASK_PROPOSED.toString());
            isValid = Combination.validate(proposedCombinationString);
        }while(!isValid);

        return  new Combination(proposedCombinationString);
    }

    private void printResult() {
        Attempts lastAttempts = attempts.get(attempts.size() -1);
        if(lastAttempts.isWin()){
            console.writeln(Message.WON.toString());
        }else {
            console.writeln(Message.LOSER.toString());
        }
    }


}
