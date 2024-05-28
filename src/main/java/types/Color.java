package types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Color {
    BLUE('b'),
    RED('r'),
    GREEN('g'),
    YELLOW('y'),
    CYAN('c'),
    MAGENTA('m'),
    NULL(' ');

    private final char character;

    Color(char character){
        this.character = character;
    }

    public static Color get(char character) {
        for (Color color : Color.getAll()) {
            if (color.character == character) {
                return color;
            }
        }
        return Color.NULL;
    }

    public static List<Color> getAll() {
        List<Color> colors = new ArrayList<>(Arrays.asList(Color.values()));
        colors.remove(Color.NULL);
        return colors;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
