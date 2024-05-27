package types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Color {
    BLUE('b', "\033[34m"),
    RED('r', "\033[31m"),
    GREEN('g', "\033[32m"),
    YELLOW('y', "\033[33m"),
    CYAN('c', "\033[36m"),
    MAGENTA('m', "\033[35m"),
    NULL(' ', "\u001B[0m");

    private final char character;
    private String tint;

    Color(char character, String tint){
        this.character = character;
        this.tint = tint;
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

    public static String getAllInitials() {
        StringBuilder result = new StringBuilder();
        for (Color color : Color.getAll()) {
            result.append(color.character);
        }
        return result.toString();
    }

    public boolean isNull() {
        return this == Color.NULL;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
