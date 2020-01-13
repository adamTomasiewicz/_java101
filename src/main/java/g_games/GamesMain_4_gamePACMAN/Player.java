package g_games.GamesMain_4_gamePACMAN;

import java.util.LinkedList;

public class Player {
    static LinkedList<Player> playerList = new LinkedList<>();
    private boolean isAlive;
    private char symbol;
    private int rowNumber;
    private int columnNumber;

    public Player(char symbol, int rowNumber, int columnNumber) {
        this.isAlive = true;
        this.symbol = symbol;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        getPlayerList().add(this);
    }
    public static LinkedList<Player> getPlayerList() {
        return playerList;
    }
    public static void setPlayerList(LinkedList<Player> playerList) {
        Player.playerList = playerList;
    }

    public boolean isAlive() { return isAlive; }
    public void setAlive(boolean alive) { isAlive = alive; }

    public char getSymbol() { return symbol; }

    public void setSymbol(char symbol) { this.symbol = symbol; }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "isAlive=" + isAlive +
                ", symbol=" + symbol +
                ", rowNumber=" + rowNumber +
                ", columnNumber=" + columnNumber +
                '}';
    }
    static void printActivePlayers(){
        for (Player player: getPlayerList()) {
            if(player.isAlive()){
                System.out.println(player);
            }
        }
    }
}
