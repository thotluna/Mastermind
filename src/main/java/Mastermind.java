import utils.Console;
import utils.YesNotQuestion;

public class Mastermind {

    public void play(){
        do {
            Console.getInstance().write(Message.TITLE.toString());
            new Game().start();
        }while (new YesNotQuestion().read(Message.RESUME.toString()).isAffirmative());
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
