package m_miniGames.MiniGameMain_4_gamePACMAN;

public interface Actionable {

    void runLobby();
    void printLobbyMenu();

    void actionsInGame();
    void checkMove(Player playerActive, int rowNumber, int columnNumber);
    void movePlayer(Player playerActive, String direction);
    void killPlayer(Player p);

    // void quitGame();








}
