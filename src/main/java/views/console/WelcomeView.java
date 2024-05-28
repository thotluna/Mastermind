package views.console;

import controllers.StartController;
import utils.Console;

public class WelcomeView extends PrintView{

    public void interact(StartController startController) {
        console.write(Message.TITLE.toString());
        startController.next();
    }
}
