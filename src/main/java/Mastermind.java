import controllers.LogicController;
import views.View;

public abstract class Mastermind {
    private final View view;
    private final LogicController logicController;

    protected Mastermind() {
        view = this.createView();
        logicController = new LogicController();
    }

    public void play(){
        do {
            view.interact(logicController.getController());
        }while (!logicController.isFinished());
    }

    public abstract View createView();
}
