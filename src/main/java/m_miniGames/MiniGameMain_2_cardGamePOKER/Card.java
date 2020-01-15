package m_miniGames.MiniGameMain_2_cardGamePOKER;

public class Card implements Comparable<Card>{
        Figure figure;
        Color color;

        public Card(Figure figure, Color color) {
            this.figure = figure;
            this.color = color;
        }

        @Override
    public int compareTo(Card card) {
        return this.getFigure().compareTo(card.getFigure());
    }


    @Override
        public String toString() {
            return "Karta [figure=" + figure + ", color=" + color + "]";
        }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

