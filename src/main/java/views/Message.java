package views;

public enum Message {
    TITLE("----- MASTERMIND -----"),
    ATTEMPTS("%d attempt(s):"),
    RESUME("Do you want to continue?"),
    ATTEMPT("%s --> %d blacks and %d whites"),
    ASK_PROPOSED("Propose a combination: "),
    WON("You've won!!! ;-)"),
    LOSER("You've lost!!! :-(");

    private final String message;

    Message(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
