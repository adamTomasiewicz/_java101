package m_mindcraft;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private List<Player> players = new ArrayList<>();

    public Game(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    void scoreBoard() {
        List<Player> winners = new ArrayList<>();
        for (Player player : players) {
            if (player.getPoints() >= 100) {
                winners.add(player);
            }
        }
        int length = winners.size();
        int range = 0;

        for (int i = 0; i < winners.size(); i++) {
            range = length - 1 - i;
            for (int j = 0; j < range; j++) {
                if (winners.get(i).getPoints() > winners.get(i - 1).getPoints()) {
                    Player temp = winners.get(i - 1);
                    winners.add((i - 1), winners.get(i));
                    winners.add(i, temp);
                }
            }
        }

    }

}
