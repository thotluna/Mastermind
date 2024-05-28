package models;

import java.util.HashSet;
import java.util.Set;

public class Validate {
    public static final String PATTERN = "^(?!.*(.).*\1)[rgybmc]{4}$";
    private final String combinationString;

    public Validate(String combinationString) {
        this.combinationString = combinationString;
    }

    public boolean isLongCorrect(){
        return combinationString.length() == Combination.WIDTH;
    }

    public boolean matches(){
        return combinationString.matches(PATTERN);
    }

    public boolean noDuplicate(){
        char[] chars = combinationString.toCharArray();
        Set<Character> combinationSet = new HashSet<>();
        for(char character : chars){
            combinationSet.add(character);
        }

        return combinationString.length() == combinationSet.size();
    }

}
