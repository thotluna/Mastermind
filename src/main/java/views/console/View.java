package views.console;

import models.Game;
import utils.Console;

public abstract class  View {
    protected final Game game;
    protected final Console console;

    protected View(Game game) {
        this.game = game;
        console = Console.getInstance();
    }

    public abstract void interact();
}
