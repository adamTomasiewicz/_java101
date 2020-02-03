package m_miniGames.MiniGameMain_5_hungerStrike;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private static final int COOKING_EFFICIENCY = 1;
    private static final int COOKING_SPEED = 5;
    private Timer dishGeneratorTimer;
    private HashMap<Dish, Integer> stock;
    private int moneyEarned;
    private int moneyLost;

    public Restaurant(int baseAmount) {
        initStock(baseAmount);
        this.moneyEarned = 0;
        this.moneyLost = 0;
    }

    private void initStock(int baseAmount) {
        this.stock = new HashMap<>();
        this.stock.put(Dish.ICE_CREAM, baseAmount);
        this.stock.put(Dish.GYROS, baseAmount);
        this.stock.put(Dish.PIZZA, baseAmount);
        this.stock.put(Dish.STEAK, baseAmount);
        this.stock.put(Dish.TORTILLA, baseAmount);
    }

    public boolean order(Dish dishOrdered, int timesOrdered) {
        synchronized (this.stock) {
            int timesAvailable = this.stock.get(dishOrdered);
            int orderValue = dishOrdered.getPrice() * timesAvailable;
            if (timesAvailable >= timesOrdered) {
                this.stock.put(dishOrdered, timesAvailable - timesOrdered);
                moneyEarned += orderValue;
                return true;
            }
            moneyLost += orderValue;
            return false;
        }
    }

    public void startCooking() {
        ActionListener actionListener = e -> {
            synchronized (this.stock) {
                System.out.println("Money earned|lost "
                        + this.moneyEarned
                        + " | "
                        + this.moneyLost
                        + " Current stock:");

                for (Map.Entry<Dish, Integer> entry : this.stock.entrySet()) {
                    entry.setValue(entry.getValue() + COOKING_EFFICIENCY);
                    System.out.println(entry.getValue() + " " + entry.getKey().name() + " ");
                }
                System.out.print("\n"); //apropo regexów :)
            }
        };
        this.dishGeneratorTimer = new Timer(COOKING_SPEED * 1000, actionListener);
        this.dishGeneratorTimer.setInitialDelay(COOKING_SPEED * 1000); //chyba zbędne
        this.dishGeneratorTimer.start();
    }

}
