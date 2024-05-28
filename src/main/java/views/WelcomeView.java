package views;

import utils.Console;

public class WelcomeView {
    private final Console console;

    public WelcomeView() {
        console = Console.getInstance();
    }


    public void interact() {
        console.write(Message.TITLE.toString());
    }
}
