package m_miniGames.MiniGameMain_2_cardGamePOKER;


import java.util.Arrays;
import java.util.List;

public class CardLayout {

    private static CardLayout instance;
    private List<Card> cardLayout ;


    public CardLayout() {

        this.cardLayout = Arrays.asList(new Card(Figure.valueOf("TWO"),Color.valueOf("PIK")), new Card(Figure.valueOf("TWO"),Color.valueOf("PIK")),
                new Card(Figure.valueOf("TWO"),Color.valueOf("PIK")),new Card(Figure.valueOf("TWO"),Color.valueOf("PIK")),new Card(Figure.valueOf("TWO"),Color.valueOf("PIK")));
    }

    public static CardLayout getInstance() {
        if (instance == null) {
            instance = new CardLayout();
        }
        return instance;
    }




    public List<Card> getLayout() {
        return cardLayout;
    }

    public void setCardInLayout (int index, Card card) {
        CardLayout.getInstance().getLayout().set(index, card);
    }
}
