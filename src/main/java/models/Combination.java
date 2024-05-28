package models;

import types.ResultAttempt;
import types.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Combination {

    public static final int WIDTH = 4;
    private final List<Color> combination;

    public Combination() {
        List<Color> propositions = Color.getAll();
        int nColorsRemove = propositions.size() - WIDTH;
        int[] listIndex = new int[nColorsRemove];
        do{
            for (int i = 0; i< nColorsRemove; i++){
                listIndex[i] = new Random().nextInt(propositions.size() + 1);
            }
        }while (listIndex[0] != listIndex[1]);

        for(int index : listIndex){
            if(propositions.size() > index) {
                propositions.remove(index);
            }
        }

        combination = propositions;
        Collections.shuffle(combination);
    }

    public Combination(String combination) {
        this.combination = new ArrayList<>();
        for (char color: combination.toCharArray()){
            this.combination.add(Color.get(color));
        }
    }

    public String printWithAsterisk() {
        return "*".repeat(combination.size());
    }

    public ResultAttempt compare(Combination proposedCombination) {
        assert proposedCombination.length() == Combination.WIDTH;
        assert this.length() == Combination.WIDTH;

        int black = 0;
        int white = 0;
        for (int i = 0; i < combination.size(); i++) {
            if(combination.get(i) == proposedCombination.combination.get(i)){
                black ++;
            }else if(combination.contains(proposedCombination.combination.get(i))){
                white ++;
            }
        }
        return new ResultAttempt(black, white);
    }

    public int length(){
        return combination.size();
    }

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for(Color color : combination){
           word.append(color.toString());
        }

        return word.toString();
    }
}
