package models;

public class Attempts {
    private final Combination proposedCombination;
    private final int nAttempt;
    private final int black;
    private final int white;

    public Attempts(int nAttempt, Combination proposedCombination, int black, int white) {
        this.proposedCombination = proposedCombination;
        this.nAttempt = nAttempt;
        this.black = black;
        this.white = white;
    }

    public Combination getProposedCombination() {
        return proposedCombination;
    }

    public int getBlack() {
        return black;
    }

    public int getWhite() {
        return white;
    }

    public boolean isWin() {
        return black == Combination.WIDTH;
    }

    public boolean isFinished() {
        return isWin() || nAttempt > 10;
    }
}
