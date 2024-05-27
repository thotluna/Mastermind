public enum Error {
    LENGTH("Wrong proposed combination length"),
    NOT_COLOR("Wrong colors, they must be: rgybmc"),
    DUPLICATED("Wrong colors, duplicates not allowed")
    ;
    private final String message;

     Error(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
