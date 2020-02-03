package pl.adamTomasiewicz.b_akademia.b_oop.e_gra;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Adam", "Joker", 111);
        Player player2 = new Player("Andrzej", "Mordehai", 99);
        Player player3 = new Player("Józek", "Kozodojka", 44);
        Player player4 = new Player("Bogdan", "Karamba", 125);
        Player player5 = new Player("Zbyszek", "BigBlackBoss", 100);
        List<Player> playersGame1 = Arrays.asList(player1, player2, player3, player4, player5);
        Game game1 = new Game("SkyJump", playersGame1);

        game1.scoreBoard();


    }
}
