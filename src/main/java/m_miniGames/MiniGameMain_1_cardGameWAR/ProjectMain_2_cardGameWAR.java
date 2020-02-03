package m_miniGames.MiniGameMain_1_cardGameWAR;

import java.util.*;

public class ProjectMain_2_cardGameWAR {
    public static void main(String[] args) {


        Scanner scanner1 = new Scanner(System.in);
        String stringInput = "";
        int intInput = 0;


        System.out.println("podaj liczbe graczy");
        int numberOfPlayers = 0;
        numberOfPlayers = scanner1.nextInt();

        Player.arrayOfPlayers = new Player[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("podaj imie gracza nr" + (i + 1));
            Player.arrayOfPlayers[i] = new Player(returnPlayersName());
        }
        System.out.println("podaj liczbe talii");
        int numberOfDecks = 0;
        numberOfDecks = scanner1.nextInt();

        //values 11-J ; 12-Q ; 13-K; 14-AS
        LinkedList<Integer> allValuesOfCards = new LinkedList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
        LinkedList<Integer> allCards = new LinkedList<>();
        for (int i = 1; i <= numberOfDecks; i++) {
            allCards.addAll(allValuesOfCards);
            allCards.addAll(allValuesOfCards);
            allCards.addAll(allValuesOfCards);
            allCards.addAll(allValuesOfCards);
        }
        //shuffle cards
        Collections.shuffle(allCards);
        System.out.println("all cards");
        for (Integer i : allCards) {
            System.out.print(i + ", ");
        }
        //deal
        int counter = 0;
        for (int i = 0, n = allCards.size(); i < n; i++) {
            Player.arrayOfPlayers[counter].queueOfCards.offerFirst(allCards.get(i));
            counter++;
            if (counter == numberOfPlayers) counter = 0;
        }
        //print cards of every player
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println(" ");
            System.out.println("karty gracza nr " + (i + 1));
            System.out.println(Player.arrayOfPlayers[i]);
        }

        //core play
        Map<Integer, Integer> mapPlayerCardToCompare = new LinkedHashMap<>();
        Map<Integer, Integer> mapPlayerCardsToCompare2 = new LinkedHashMap<>();
        LinkedList<Integer> prizePool = new LinkedList<>();

        int nullCounter = 0;
        int roundCounter = 0;
        int highestValueCounter = 0;
        int highestValue2 = 0;
        int highestValueCounter2 = 0;
        Integer highestValue;
        while (nullCounter < (numberOfPlayers - 1)) {
            nullCounter = 0;
            highestValue = 0;
            highestValueCounter = 0;
            highestValue2 = 0;
            highestValueCounter2 = 0;
            System.out.println("-----------");
            System.out.println("start round nr " + ++roundCounter);
            for (int i = 0; i < numberOfPlayers; i++) {
                if (Player.arrayOfPlayers[i].getQueueOfCards() != null) {
                    mapPlayerCardToCompare.put(i, Player.arrayOfPlayers[i].queueOfCards.poll());
                    prizePool.add(i, mapPlayerCardToCompare.get(i));
                    if (mapPlayerCardToCompare.get(i) > highestValue) {
                        highestValue = mapPlayerCardToCompare.get(i);
                    }
                }
                for (Map.Entry entry : mapPlayerCardToCompare.entrySet()) {
                    if (entry.getValue() == (highestValue)) {
                        highestValueCounter++;
                    }
                }
            }
//            for (int i = 0; i <mapPlayerCardToCompare.entrySet().size() ; i++) {
//
//            }
            //if 1 player have highest value
//            if (highestValueCounter == 1) {
//                for (Map.Entry entry : mapPlayerCardToCompare.entrySet()) {
//                    if (entry.getValue() >= (highestValue)) {
//                        for (int i = 0, n = prizePool.size(); i < n; i++) {
//                            if (prizePool.get(i) != null) {
//                                Player.arrayOfPlayers[(int) entry.getKey()].queueOfCards.offerLast(prizePool.get(i));
//                            }
//                        }
//                        System.out.println(prizePool);
//                        System.out.println("prizePool goes to " + Player.arrayOfPlayers[(int) entry.getKey()].getName());
//                        prizePool.clear();
//
//                    }
//
//                }
//            }

            //if 2 or more players have highest values
            if (highestValueCounter > 1) {

                highestValue2 = 0;
                highestValueCounter2 = 0;
                for (Map.Entry entry : mapPlayerCardToCompare.entrySet()) {
                    if (entry.getValue() == (highestValue)) {
                        if (Player.arrayOfPlayers[(int) entry.getKey()].getQueueOfCards() != null) {
                            prizePool.add(Player.arrayOfPlayers[(int) entry.getKey()].queueOfCards.poll());
                            mapPlayerCardsToCompare2.put((Integer) entry.getKey(), Player.arrayOfPlayers[(int) entry.getKey()].queueOfCards.poll());
                            prizePool.add(mapPlayerCardsToCompare2.get(entry.getKey()));

                            if (mapPlayerCardsToCompare2.get(entry.getKey()) > highestValue2) {
                                highestValue2 = mapPlayerCardsToCompare2.get(entry.getKey());
                            }
                        }
                    }
                }
//                for (Map.Entry entry : mapPlayerCardToCompare.entrySet()) {
//                    if (entry.getValue() >= (highestValue)) {
//                        for (int i = 0, n = prizePool.size(); i < n; i++) {
//                            if (prizePool.get(i) != null) {
//                                Player.arrayOfPlayers[(int) entry.getKey()].queueOfCards.offerLast(prizePool.get(i));
//                            }
//                        }
//                        System.out.println(prizePool);
//                        System.out.println("prizePool goes to " + Player.arrayOfPlayers[(int) entry.getKey()].getName());
//                        prizePool.clear();
//
//                    }
//
//                }

                System.out.println(mapPlayerCardToCompare);
                mapPlayerCardToCompare.clear();


                for (int i = 0; i < numberOfPlayers; i++) {
                    if (Player.arrayOfPlayers[i].getQueueOfCards() == null) {
                        nullCounter++;
                    }
                }

            }

            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println(" ");
                System.out.println("karty gracza nr " + (i + 1));
                System.out.println(Player.arrayOfPlayers[i]);
            }


        }
        scanner1.close();
    }
    //todo: 1 jak przedstawic talie kart? to powinna byc lista
    //4 kolory, 52 karty,  6Pik, jTrefl, K-Karo , kier
    //metody:tasowanie, rozegranie meczu

    ////

    // rozdane karty powinny być na listach, albo powinny być obiektami z listą w środku

    //akcje aplikacji:
    //na poczatku skaner przyjmuje zakres rozgrywki, ile talii? ilu graczy? moze imona graczy?
    //tasuje 52 karty (1 lub wiecej talii)
    //rozdaje pomiedzy graczy (2 lub wiecej - zmienna numberOfPlayers)
    //kazdy z graczy iteracyjnie dostaje swoja liste kart i swoj numer po ktorym kolejno beda wykladac karty, gracz ktorego lista sie skonczy odpada
    //kolory kart nie maja znaczenia tylko numerki
    //metoda porownania jesli karta ma nizszy numerek przegrywasz, jesli ma najwyzszy, jesli sa inni ktorzy maja najwyzszy nr to wywolaj
    //metode dogrywka
    //fajnie byloby sumowac
    //moze zamiast listy kart queue FILO?


    public static String returnPlayersName() {

        String playersName = null;

        Scanner scanner2 = new Scanner(System.in);
        playersName = scanner2.nextLine();

        return playersName;
    }
}


class Player {
    static Player[] arrayOfPlayers;
    static int counter = 0;

    String name;
    ArrayDeque<Integer> queueOfCards = new ArrayDeque<>();

    public Player() {
        this.name = "testPlayer";
        arrayOfPlayers[counter++] = this;
    }

    public Player(String name) {
        this.name = name;
        arrayOfPlayers[counter++] = this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayDeque<Integer> getQueueOfCards() {
        return !queueOfCards.isEmpty() ? queueOfCards : null;
    }

    public void setQueueOfCards(ArrayDeque<Integer> queueOfCards) {
        this.queueOfCards = queueOfCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", queueOfCards=" + queueOfCards +
                '}';
    }
}
