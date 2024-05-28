package views.console;

import utils.Console;
import views.console.Message;

public class WelcomeView {
    private final Console console;

    public WelcomeView() {
        console = Console.getInstance();
    }


    public void interact() {
        console.write(Message.TITLE.toString());
    }
}
