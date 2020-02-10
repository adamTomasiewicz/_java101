package m_mindcraft.exceptions_for_mindcraft;

public class MissingToolException extends Exception {
    private final int position;

    public MissingToolException(int position) {
        this.position = position;
    }


}
