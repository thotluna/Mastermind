import views.View;

public abstract class Mastermind {
    private final View view;

    protected Mastermind() {
        view = this.createView();
    }

    public void play(){
        view.interact();
    }

    public abstract View createView();
}
