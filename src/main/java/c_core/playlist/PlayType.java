package c_core.playlist;

public enum PlayType {
    PLAY("PLAY"), SEQUENTIAL("SEQU"), RANDOM("RAND"), LOOP("LOOP");
    private String shortName;

    PlayType() {
    }

    PlayType(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
