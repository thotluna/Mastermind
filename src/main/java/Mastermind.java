import views.ConsoleView;

public class Mastermind {

    public void play(ConsoleView view){
        view.interact();
    }

    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        new Mastermind().play(view);
    }
}
