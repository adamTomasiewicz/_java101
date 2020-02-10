package m_mindcraft.exceptions_for_mindcraft;

public class NoBlockException extends Exception {

    private final int position;

    public NoBlockException(int position) {
        this.position = position;
    }
}
