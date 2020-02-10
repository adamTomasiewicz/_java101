package b_javaBasics._exceptions.exceptions_for_mindcraft;

public class NoBlockException extends Exception {

    private final int position;

    public NoBlockException(int position) {
        this.position = position;
    }
}
