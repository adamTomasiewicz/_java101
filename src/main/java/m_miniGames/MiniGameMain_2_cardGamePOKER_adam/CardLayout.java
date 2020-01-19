package m_miniGames.MiniGameMain_2_cardGamePOKER_adam;


import java.util.Arrays;
import java.util.List;

enum CardLayout {

    POKER_KROLEWSKI(10), POKER(9), KARETA(8),
    FULL(7), KOLOR(6), STRIT(5),
    TROJKA(4), DWIE_PARY(3), PARA(2),
    WYSOKA_KARTA(1);

    int value;

    private List<Card> cardLayout ;


    CardLayout(int value) {
        this.value=value;
        this.cardLayout = Arrays.asList(
                new Card(Figure.TWO,Color.PIK),
                new Card(Figure.TWO,Color.PIK),
                new Card(Figure.TWO,Color.PIK),
                new Card(Figure.TWO,Color.PIK),
                new Card(Figure.TWO,Color.PIK));
    }

    public List<Card> getLayout() {
        return cardLayout;
    }

    public void setCardInLayout (int index, Card card) {
        getLayout().set(index, card);
    }
}
