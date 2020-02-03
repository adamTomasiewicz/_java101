package m_miniGames.MiniGameMain_3_tamagoci;

import java.util.Random;
import java.util.Scanner;

public class MiniGameMain_3_tamagotchi {

    private static MiniGameMain_3_tamagotchi tamagotchi;
    private boolean isAlvie;

    private byte foodLVL; //up to 5
    private byte poopLVL; //up to 3
    private byte sleepLVL; //up to 3
    private byte happyLVL; //up to 5

    private byte sicknessLVL; // up to 3
    private byte counterMoves;

    public MiniGameMain_3_tamagotchi() {
        this.isAlvie = true;
        this.foodLVL = 3;
        this.sleepLVL = 3;
        this.happyLVL = 3;

    }

    public static MiniGameMain_3_tamagotchi getTamagotchi() {
        if (tamagotchi == null) {
            tamagotchi = new MiniGameMain_3_tamagotchi();
        }
        return tamagotchi;
    }

    public static void setTamagotchi(MiniGameMain_3_tamagotchi tamagotchi) {
        MiniGameMain_3_tamagotchi.tamagotchi = tamagotchi;
    }

    public static void main(String[] args) {
        MiniGameMain_3_tamagotchi tamagotchi1 = getTamagotchi();

        Scanner scanner1 = new Scanner(System.in);
        char input = '\0';
        boolean didMove = false;

        printMenu();
        do {

            System.out.println("-----DAY " + tamagotchi1.getCounterMoves() + "-----");
            printCurrentLVLs();
            didMove = false;

            while (didMove != true) {
                System.out.println("-----type your input:-----");
                input = scanner1.next().charAt(0);
                switch (input) {
                    case 'a':
                        tamagotchi1.feedUp();
                        didMove = true;
                        break;
                    case 's':
                        tamagotchi1.putToSleep();
                        didMove = true;
                        break;
                    case 'd':
                        tamagotchi1.playToMakeHappy();
                        didMove = true;
                        break;
                    case 'f':
                        tamagotchi1.getMedicine();
                        didMove = true;
                        break;


                    case 'z':
                        tamagotchi1.cleanPoop();
                        didMove = true;
                        break;
                    case 'c':
                        System.out.println("DOING NOTHING");
                        didMove = true;
                        break;
                    case 'v':
                        printCurrentLVLs();
                        break;

                    case 'q':
                        didMove = true;
                        break;
                    case 'w':
                        printMenu();
                        break;
                }

            }


            tamagotchi1.checkAlive();
            tamagotchi1.endTurn();
        }
        while (tamagotchi1.isAlvie() & input != 'q');
        if (tamagotchi1.isAlvie == false) {
            System.out.println("Your Tamagotchi died. Better luck next time!");
        }
        if (input == 'q') {
            System.out.println("You quit the game. Better luck next time!");
        }
        scanner1.close();
    }

    static void printMenu() {
        System.out.println("Tamagotchi actions:");
        System.out.println("press a to feed");
        System.out.println("press z to clean poop");
        System.out.println("press s to put to sleep");
        System.out.println("press d to play with Tamagotchi");

        System.out.println("press f to give medicine");


        System.out.println("press c to do nothing");
        System.out.println("press v to print current lvls");

        System.out.println("press q to quit");
        System.out.println("press w to print menu");

    }

    static void printCurrentLVLs() {
        System.out.println("food lvl: " + getTamagotchi().getFoodLVL());
        System.out.println("happy lvl: " + getTamagotchi().getHappyLVL());
        System.out.println("sleep lvl: " + getTamagotchi().getSleepLVL());

        System.out.println("poop lvl: " + getTamagotchi().getPoopLVL());
        System.out.println("sickness lvl: " + getTamagotchi().getSicknessLVL());

    }

    public void endTurn() {
        setFoodLVL((byte) (getFoodLVL() - 1));
        setPoopLVL((byte) (getPoopLVL() + 1));
        setSleepLVL((byte) (getSleepLVL() - 1));
        setHappyLVL((byte) (getHappyLVL() - 1));

        Random random1 = new Random();
        int randomInt = random1.nextInt(2);
        if (getSicknessLVL() == 0) {
            setSicknessLVL((byte) randomInt);
        } else {
            setSicknessLVL((byte) (getSicknessLVL() + 1));
        }
        if (getPoopLVL() > 1 & getSicknessLVL() > 0) {
            setSicknessLVL((byte) (getSicknessLVL() + 1));
        }
        setCounterMoves((byte) (getCounterMoves() + 1));
    }

    public void putToSleep() {
        setSleepLVL((byte) 5);
    }

    public void getMedicine() {
        setSicknessLVL((byte) 0);
    }

    public void playToMakeHappy() {
        setHappyLVL((byte) 5);
    }

    public void cleanPoop() {
        setPoopLVL((byte) 0);
    }

    public void feedUp() {
        setFoodLVL((byte) 5);
    }

    public void checkAlive() {
        if (getFoodLVL() == 0 | getSleepLVL() == 0 | getSicknessLVL() == 3) {
            setAlvie(false);
            System.out.println("RIP TAMAGOTCHI :(");
        }
    }

    @Override
    public String toString() {
        return "MiniGameMain_3_tamagotchi{" +
                "isAlvie=" + isAlvie +
                ", foodLVL=" + foodLVL +
                ", poopLVL=" + poopLVL +
                ", sleepLVL=" + sleepLVL +
                ", happyLVL=" + happyLVL +
                ", sicknessLVL=" + sicknessLVL +
                ", counterMoves=" + counterMoves +
                '}';
    }

    public boolean isAlvie() {
        return isAlvie;
    }

    public void setAlvie(boolean alvie) {
        isAlvie = alvie;
    }

    public byte getFoodLVL() {
        return foodLVL;
    }

    public void setFoodLVL(byte foodLVL) {
        this.foodLVL = foodLVL;
    }

    public byte getPoopLVL() {
        return poopLVL;
    }

    public void setPoopLVL(byte poopLVL) {
        this.poopLVL = poopLVL;
    }

    public byte getSleepLVL() {
        return sleepLVL;
    }

    public void setSleepLVL(byte sleepLVL) {
        this.sleepLVL = sleepLVL;
    }

    public byte getHappyLVL() {
        return happyLVL;
    }

    public void setHappyLVL(byte happyLVL) {
        this.happyLVL = happyLVL;
    }

    public byte getSicknessLVL() {
        return sicknessLVL;
    }

    public void setSicknessLVL(byte sicknessLVL) {
        this.sicknessLVL = sicknessLVL;
    }

    public byte getCounterMoves() {
        return counterMoves;
    }

    public void setCounterMoves(byte counterMoves) {
        this.counterMoves = counterMoves;
    }
}
