package g_games.GamesMain_2_cardGamePOKER;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    static ArrayList<Deck> allDecks = new ArrayList<>();
    private boolean isShuffled;
    private ArrayList<Card> listOfCards= new ArrayList<>();


    public Deck() {

        this.isShuffled = false;

        for (Figure figure: Figure.values()){
            for (Color color: Color.values()){
                this.listOfCards.add(new Card(figure,color));
            }
        }
        allDecks.add(this);

    }

    public static ArrayList<Deck> getAllDecks() {
        return allDecks;
    }

    public static void setAllDecks(ArrayList<Deck> allDecks) {
        Deck.allDecks = allDecks;
    }

    public boolean isShuffled() {
        return isShuffled;
    }

    public void setShuffled() {
        Collections.shuffle(this.listOfCards);
        this.isShuffled=true;
    }

    public ArrayList<Card> getListOfCards() {
        return listOfCards;
    }

    public void setListOfCards(ArrayList<Card> listOfCards) {
        this.listOfCards = listOfCards;
    }
}
