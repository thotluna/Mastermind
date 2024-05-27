import utils.Console;

import java.util.HashSet;
import java.util.Set;

public class Validate {
    public static final String PATTERN = "^(?!.*(.).*\1)[rgybmc]{4}$";
    private final String combinationString;
    private final Console console;

    public Validate(String combinationString) {
        this.combinationString = combinationString;
        console = Console.getInstance();
    }

    public Boolean isValidate(){
        return isLongCorrect() && matches() && noDuplicate();
    }

    private boolean isLongCorrect(){
        if(combinationString.length() != Combination.WIDTH){
            console.writeError(Error.LENGTH.toString());
            return false;
        }
        return true;
    }

    private boolean matches(){
        if(!combinationString.matches(PATTERN)){
            console.writeError(Error.NOT_COLOR.toString());
            return false;
        }
        return true;
    }

    private boolean noDuplicate(){
        char[] chars = combinationString.toCharArray();
        Set<Character> combinationSet = new HashSet<>();
        for(char character : chars){
            combinationSet.add(character);
        }

        if(combinationString.length() != combinationSet.size()){
            console.writeError(Error.DUPLICATED.toString());
            return false;
        }

        return true;
    }

}
