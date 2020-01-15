package m_miniGames.MiniGameMain_2_cardGamePOKER;


import java.util.*;

public class MiniGameMain_2_cardGamePOKER {


    public static void main(String[] args) {

        CardLayout cardLayoutInstance1 = CardLayout.getInstance();
        Deck deck1 = new Deck();
        deck1.setShuffled();
        Random random = new Random();
        int randomResult = 0;
        System.out.println("unsorted cards");
        for (int i = 0; i < 5; i++) {
            randomResult = random.nextInt(51);
            cardLayoutInstance1.setCardInLayout(i, deck1.getAllDecks().get(0).getListOfCards().get(randomResult));
            System.out.println(deck1.getAllDecks().get(0).getListOfCards().get(i));
        }
        Collections.sort(cardLayoutInstance1.getLayout());
        System.out.println("sorted cards");
        for (Card card : cardLayoutInstance1.getLayout()) {
            System.out.println(card);
        }

        if (haveRoyalFlush(cardLayoutInstance1.getLayout())) {
            System.out.println("haveRoyalFlush");

        } else if (haveStraightFlush(cardLayoutInstance1.getLayout())) {
            System.out.println("haveStraightFlush");

        } else if (haveFourOfKind_Quads(cardLayoutInstance1.getLayout())) {
            System.out.println("haveFourOfKind_Quads");
        } else if (haveFullHause(cardLayoutInstance1.getLayout())) {
            System.out.println("haveFullHause");
        } else if (haveStraight(cardLayoutInstance1.getLayout())) {
            System.out.println("haveStraight");
        } else if (haveFlush(cardLayoutInstance1.getLayout())) {
                System.out.println("haveFlush");
        } else if (haveThreeOfKind(cardLayoutInstance1.getLayout())) {
            System.out.println("haveThreeOfKind");
        } else if (haveTwoPairs(cardLayoutInstance1.getLayout())) {
            System.out.println("haveTwoPairs");
        } else if (haveOnePair(cardLayoutInstance1.getLayout())) {
            System.out.println("haveOnePair");
        } else {
        System.out.println("haveHighestCard");
        }
    }


    static boolean haveRoyalFlush(List<Card> cardLayout) {
        boolean isTrue1 = true;
        boolean isTrue2 = true;
        int firstCardValue = cardLayout.get(0).getFigure().getValue();

        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getFigure().getValue() != firstCardValue + i) {
                    isTrue1 = false;
            }
        }
        if(firstCardValue!=10){
            isTrue1 = false;
        }
        int firstCardColor = cardLayout.get(0).getColor().getValue();
        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getColor().getValue() != firstCardColor) {
                isTrue2 = false;
            }
        }
        return isTrue1&isTrue2;
    }

    static boolean haveStraightFlush(List<Card> cardLayout) {
        boolean isTrue1 = true;
        boolean isTrue2 = true;
        int firstCardValue = cardLayout.get(0).getFigure().getValue();
        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getFigure().getValue() != firstCardValue + i) {
                isTrue1 = false;
            }
        }
        int firstCardColor = cardLayout.get(0).getColor().getValue();
        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getColor().getValue() != firstCardColor) {
                isTrue2 = false;
            }
        }
        return isTrue1&isTrue2;
    }

    static boolean haveFourOfKind_Quads(List<Card> cardLayout) {
        boolean isTrue1 = false;

        for (int i = 3; i < 5; i++) {
            if (cardLayout.get(i - 3).getFigure().getValue() == cardLayout.get(i - 2).getFigure().getValue() &
                    cardLayout.get(i - 2).getFigure().getValue() == cardLayout.get(i - 1).getFigure().getValue() &
                    cardLayout.get(i - 1).getFigure().getValue() == cardLayout.get(i).getFigure().getValue()) {
                isTrue1 = true;
            }
        }
        return isTrue1;
    }

    static boolean haveFullHause(List<Card> cardLayout) {
        boolean isTrue1 = false;

        if (cardLayout.get(0).getFigure().getValue() == cardLayout.get(1).getFigure().getValue() &
                cardLayout.get(1).getFigure().getValue() == cardLayout.get(2).getFigure().getValue()) {
            if (cardLayout.get(3).getFigure().getValue() == cardLayout.get(4).getFigure().getValue()) {
                isTrue1 = true;
            }
        }

        if (cardLayout.get(0).getFigure().getValue() == cardLayout.get(1).getFigure().getValue()) {
            if (cardLayout.get(2).getFigure().getValue() == cardLayout.get(3).getFigure().getValue() &
                    cardLayout.get(3).getFigure().getValue() == cardLayout.get(4).getFigure().getValue()) {
                isTrue1 = true;
            }
        }


        return isTrue1;
    }

    static boolean haveFlush(List<Card> cardLayout) {
        boolean isTrue1 = true;

        int firstCardColor = cardLayout.get(0).getColor().getValue();
        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getColor().getValue() != firstCardColor) {
                isTrue1 = false;
            }
        }
        return isTrue1;
    }

    static boolean haveStraight(List<Card> cardLayout) {
        boolean isTrue1 = true;
        int firstCardValue = cardLayout.get(0).getFigure().getValue();
        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getFigure().getValue() != firstCardValue + i) {
                isTrue1 = false;
            }
        }
        return isTrue1;
    }

    static boolean haveThreeOfKind(List<Card> cardLayout) {
        boolean isTrue1 = false;

        for (int i = 2; i < 5; i++) {
            if (cardLayout.get(i).getFigure().getValue() == cardLayout.get(i - 1).getFigure().getValue() &
                    cardLayout.get(i).getFigure().getValue() == cardLayout.get(i - 2).getFigure().getValue()) {
                isTrue1 = true;
            }
        }

        return isTrue1;
    }

    static boolean haveTwoPairs(List<Card> cardLayout) {
        boolean isTrue1 = false;
        boolean isTrue2 = false;

        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getFigure().getValue() == cardLayout.get(i - 1).getFigure().getValue()) {

                isTrue1 = true;
                for (int j = i + 1; j < cardLayout.size(); j++) {
                    if (cardLayout.get(j).getFigure().getValue() == cardLayout.get(j - 1).getFigure().getValue()) {

                        isTrue2 = true;
                    }
                }
            }
        }
        return isTrue1 & isTrue2;
    }

    static boolean haveOnePair(List<Card> cardLayout) {
        for (int i = 1; i < 5; i++) {
            if (cardLayout.get(i).getFigure().getValue() == cardLayout.get(i - 1).getFigure().getValue()) {
                return true;
            }
        }
        return false;
    }

    static boolean haveHighestCard(List<Card> cardLayout) {
        Card highestCard = new Card(Figure.valueOf("TWO"), Color.valueOf("PIK"));

        System.out.println("highest card:");
        System.out.println(highestCard);
        for (Card card : cardLayout) {
            if (card.getFigure().getValue() > highestCard.getFigure().getValue()) {
                highestCard = card;
            }
        }

        return true;
    }


}
