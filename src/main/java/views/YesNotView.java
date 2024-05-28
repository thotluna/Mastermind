package views;

import utils.YesNotQuestion;

public class YesNotView {

    private final String title;

    public YesNotView(String title) {
        this.title = title;
    }

    public boolean isAffirmative() {
        return new YesNotQuestion().read(title).isAffirmative();
    }
}
