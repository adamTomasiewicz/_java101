package m_miniGames.MiniGameMain_4_gamePACMAN;

import java.util.Random;
import java.util.Scanner;

public class Game implements Actionable {

    private static Game instance;
    private char[][] charArray;
    private int counterMoves;
    private int counterScore;


    private Game() {
        this.charArray = new char[][]{
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
        };
        this.counterScore = 10;
        this.counterMoves = 0;
    }


    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }


    public void printLobbyMenu() {

        System.out.println("type r_to_start new game_startNewGame_PacMan()");
        System.out.println("type v_to_print game instructions_printGameInstructions()");

        System.out.println("type w_to_print lobby menu_printLobbyMenu()");
        System.out.println("type q_to_quit the game_quit()");

    }


    public void printGameInstructions() {
        System.out.println("your character is \"P\" ");
        System.out.println("you have to avoid \"@\" and collect \"$\" ");
        System.out.println("you use \"e\", \"s\", \"d\", \"f\" to navigate");
        System.out.println("GL & HF! :)");
    }


    public void printInGameMenu() {


        System.out.println("type a_to_print map_printInGameMap()");
        System.out.println("type z_to_print active players_printActivePlayers()");
        System.out.println("type v_to_print instructions_printInstructions()");
        System.out.println(" ");
        System.out.println("type e_to_move player north_movePlayer(\"north\")");
        System.out.println("type s_to_move player east_movePlayer(\"west\")");
        System.out.println("type d_to_move player south_movePlayer(\"south\")");
        System.out.println("type f_to_move player west_movePlayer(\"east\")");
        System.out.println(" ");
        System.out.println("type r_to_restart game_startNewGame_PacMan()");
        System.out.println("type w_to_print in game menu_printInGameMenu()");
        System.out.println("type q_to_quit game quit()");
    }


    public void printInGameMap() {
        clearCharArray();
        for (Player player : Player.getPlayerList()) {
            if (player.isAlive()) {
                getCharArray()[player.getRowNumber()][player.getColumnNumber()] = player.getSymbol();
            }
        }
        for (int i = 0; i < Game.getInstance().getCharArray().length; i++) {
            for (int j = 0; j < Game.getInstance().getCharArray()[i].length; j++) {
                if (j == 0) {
                    System.out.print("[ " + getCharArray()[i][j] + " ");
                }
                if (j == 9) {
                    System.out.print(getCharArray()[i][j] + " ]");
                } else {
                    System.out.print(getCharArray()[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    public void clearCharArray() {
        for (int i = 0, lenght = this.getCharArray().length; i < lenght; i++) {
            for (int j = 0, lenght2 = this.getCharArray()[i].length; j < lenght2; j++) {
                getCharArray()[i][j] = '-';
            }
        }

    }

    @Override
    public void runLobby() {
        printLobbyMenu();
        System.out.println("waiting for input");

        Scanner scanner1 = new Scanner(System.in);
        char input = '\0';

        do {
            System.out.println("type input");
            input = scanner1.next().charAt(0);

            switch (input) {
                case 'r':
                    Game.getInstance().startNewGame_PacMan();
                    break;
                case 'v':
                    Game.getInstance().printGameInstructions();
                    break;
                case 'w':
                    Game.getInstance().printLobbyMenu();
                    break;
                case 'q':
                    break;
            }
        }
        while (input != 'q');

        scanner1.close();
    }


    public void startNewGame_PacMan() {
        Player.getPlayerList().clear();
        getInstance().clearCharArray();
        setCounterMoves(0);
        setCounterScore(10);

        Random random1 = new Random();
        int randomResultRow = random1.nextInt(9);
        int randomResultColumn = random1.nextInt(9);
        randomResultRow = random1.nextInt(9);
        randomResultColumn = random1.nextInt(9);
        new Player('P', randomResultRow, randomResultColumn);

        randomResultRow = random1.nextInt(9);
        randomResultColumn = random1.nextInt(9);
        new Player('$', randomResultRow, randomResultColumn);

        randomResultRow = random1.nextInt(9);
        randomResultColumn = random1.nextInt(9);
        new Player('$', randomResultRow, randomResultColumn);

        randomResultRow = random1.nextInt(9);
        randomResultColumn = random1.nextInt(9);
        new Player('$', randomResultRow, randomResultColumn);

        randomResultRow = random1.nextInt(9);
        randomResultColumn = random1.nextInt(9);
        new Player('@', randomResultRow, randomResultColumn);

        randomResultRow = random1.nextInt(9);
        randomResultColumn = random1.nextInt(9);
        new Player('@', randomResultRow, randomResultColumn);

        Game.getInstance().actionsInGame();
    }

    @Override
    public void actionsInGame() {

        //scanner for HUMAN INPUT
        Scanner scanner1 = new Scanner(System.in);
        char input = '\0';
        boolean didMove;
        boolean anyDolarAlive = false;

        // RANDOM for NPC MOVE
        String[] stringArray = {"north", "west", "south", "east"};
        Random random1 = new Random();
        int randomResult = 0;
        String randomDirection = "";

        System.out.println("...this is inGameMenu:");
        printInGameMenu();
        System.out.println("...this is inGameMap:");
        printInGameMap();

        do {

            didMove = false;
            anyDolarAlive = false;
//HUMAN INPUT
            while (!didMove) {
                System.out.println("type input");
                input = scanner1.next().charAt(0);
                try {
                    switch (input) {
                        case 'a':
                            didMove = false;
                            Game.getInstance().printInGameMap();
                            break;

                        case 'e':
                            didMove = false;
                            checkMove(Player.getPlayerList().getFirst(), Player.getPlayerList().getFirst().getRowNumber() - 1, Player.getPlayerList().getFirst().getColumnNumber());
                            movePlayer(Player.getPlayerList().getFirst(), "north");
                            didMove = true;
                            break;
                        case 's':
                            didMove = false;
                            checkMove(Player.getPlayerList().getFirst(), Player.getPlayerList().getFirst().getRowNumber(), Player.getPlayerList().getFirst().getColumnNumber() - 1);
                            movePlayer(Player.getPlayerList().getFirst(), "west");
                            didMove = true;
                            break;
                        case 'd':
                            didMove = false;
                            checkMove(Player.getPlayerList().getFirst(), Player.getPlayerList().getFirst().getRowNumber() + 1, Player.getPlayerList().getFirst().getColumnNumber());
                            movePlayer(Player.getPlayerList().getFirst(), "south");
                            didMove = true;
                            break;
                        case 'f':
                            didMove = false;
                            checkMove(Player.getPlayerList().getFirst(), Player.getPlayerList().getFirst().getRowNumber(), Player.getPlayerList().getFirst().getColumnNumber() + 1);
                            Game.getInstance().movePlayer(Player.getPlayerList().getFirst(), "east");
                            didMove = true;
                            break;

                        case 'v':
                            printGameInstructions();
                            break;
                        case 'z':
                            Player.printActivePlayers();
                            break;
                        case 'r':

                            Game.getInstance().startNewGame_PacMan();
                            didMove = true;
                            break;
                        case 'w':
                            didMove = false;
                            Game.getInstance().printInGameMenu();
                            break;
                        case 'q':
                            didMove = true;
                            break;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    if (input == 'e') System.out.println("you cant move north");
                    if (input == 's') System.out.println("you cant move west");
                    if (input == 'd') System.out.println("you cant move south");
                    if (input == 'f') System.out.println("you cant move east");

                }
            }
            System.out.println("end of human move");
//NPC RANDOM MOVE
            for (int i = 1, length = Player.getPlayerList().size(); i < length; i++) {
                if (Player.getPlayerList().get(i).isAlive()) {
                    didMove = false;
                    while (!didMove) {
                        System.out.println("test " + Player.getPlayerList().get(i));
                        try {
                            randomResult = random1.nextInt(4);
                            randomDirection = stringArray[randomResult];
                            if (Player.getPlayerList().get(i).getSymbol() == '$' & counterMoves % 2 == 0) {
                                Game.getInstance().movePlayer(Player.getPlayerList().get(i), randomDirection);
                                didMove = true;
                            }
                            if (Player.getPlayerList().get(i).getSymbol() == '$' & counterMoves % 2 == 1) {
                                didMove = true;
                            }
                            if (Player.getPlayerList().get(i).getSymbol() == '@') {
                                Game.getInstance().movePlayer(Player.getPlayerList().get(i), randomDirection);
                                didMove = true;
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("NPC" + Player.getPlayerList().get(i) + " cant move " + randomDirection);
                        }
                    }
                }
            }
            System.out.println("end of NPC moves");
            //is anyDolarAlive?
            for (Player player : Player.getPlayerList()) {
                if (player.getSymbol() == '$' & player.isAlive()) {
                    anyDolarAlive = true;
                }
            }
            System.out.println("end of dolar check");

            setCounterScore(getCounterScore() - 1);
            setCounterMoves(getCounterMoves() + 1);
            printInGameMap();
        }
        while (input != 'q' & Player.getPlayerList().getFirst().isAlive() & anyDolarAlive);
        if (input == 'q' & Player.getPlayerList().getFirst().isAlive()) {
            System.out.println("You quit the game. Better luck next time!");
            System.out.println("Your score: " + getCounterScore());
            System.out.println("Moves used: " + getCounterMoves());
        } else if (!Player.getPlayerList().getFirst().isAlive()) {
            System.out.println("Game Over. You lost. Better luck next time!");
            System.out.println("Your score: " + getCounterScore());
            System.out.println("Moves used: " + getCounterMoves());
        } else {
            System.out.println("You won! Congratz!");
            System.out.println("Your score: " + getCounterScore());
            System.out.println("Moves used: " + getCounterMoves());
        }
        scanner1.close();
    }

    @Override
    public void movePlayer(Player playerActive, String direction) throws ArrayIndexOutOfBoundsException {

        //move playerActive

        switch (direction) {
            case "north":
                checkMove(playerActive, playerActive.getRowNumber() - 1, playerActive.getColumnNumber());
                playerActive.setRowNumber(playerActive.getRowNumber() - 1);

                break;
            case "west":
                checkMove(playerActive, playerActive.getRowNumber(), playerActive.getColumnNumber() - 1);
                playerActive.setColumnNumber(playerActive.getColumnNumber() - 1);

                break;
            case "south":
                checkMove(playerActive, playerActive.getRowNumber() + 1, playerActive.getColumnNumber());
                playerActive.setRowNumber(playerActive.getRowNumber() + 1);

                break;
            case "east":
                checkMove(playerActive, playerActive.getRowNumber(), playerActive.getColumnNumber() + 1);
                playerActive.setColumnNumber(playerActive.getColumnNumber() + 1);
                break;
        }
    }


    public void isBorder(Player playerActive, int rowNumber, int columnNumber) throws ArrayIndexOutOfBoundsException {
        if (rowNumber < 0 | rowNumber > Game.getInstance().getCharArray().length - 1 |
                columnNumber < 0 | columnNumber > Game.getInstance().getCharArray()[0].length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }


    public void isEmpty(Player playerActive, int rowNumber, int columnNumber) throws ArrayIndexOutOfBoundsException {

        for (Player playerPassive : Player.getPlayerList()) {
            if (playerActive.getSymbol() == 'P'
                    & playerActive.getRowNumber() == playerPassive.getRowNumber()
                    & playerActive.getColumnNumber() == playerPassive.getColumnNumber()) {
                if (playerPassive.getSymbol() == '$') {
                    killPlayer(playerPassive);
                    setCounterScore(getCounterScore() + 5);
                }
                if (playerPassive.getSymbol() == '@') {
                    killPlayer(playerActive);
                }

            }
            if (playerActive.getSymbol() == '$' & playerPassive.getRowNumber() == rowNumber & playerPassive.getColumnNumber() == columnNumber) {
                killPlayer(playerActive);
            }
            if (playerPassive.getSymbol() == '@' & playerPassive.getRowNumber() == rowNumber & playerPassive.getColumnNumber() == columnNumber) {
                killPlayer(playerPassive);
            }

        }
    }

    @Override
    public void checkMove(Player playerActive, int rowNumber, int columnNumber) throws ArrayIndexOutOfBoundsException {
        isBorder(playerActive, rowNumber, columnNumber);
        isEmpty(playerActive, rowNumber, columnNumber);
    }


    @Override
    public void killPlayer(Player player) {
        player.setAlive(false);


    }


    public char[][] getCharArray() {
        return charArray;
    }

    public void setCharArray(char[][] charArray) {
        this.charArray = charArray;
    }

    public int getCounterMoves() {
        return counterMoves;
    }

    public void setCounterMoves(int counterMoves) {
        this.counterMoves = counterMoves;
    }

    public int getCounterScore() {
        return counterScore;
    }

    public void setCounterScore(int counterScore) {
        this.counterScore = counterScore;
    }
}
