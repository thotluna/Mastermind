package views.console;

import controllers.ResumeController;

public class ResumeView {

    private final YesNotView yesNotView;

    public ResumeView() {
        yesNotView = new YesNotView(Message.RESUME.toString());
    }

    public void interact(ResumeController resumeController) {
        if (yesNotView.isAffirmative()) {
            resumeController.reset();
        } else {
            resumeController.next();
        }

    }
}
