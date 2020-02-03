package c_core.car;

public class FuelTank {
    private final int totalCapacity;
    private int remainingFuel;

    //constructor
    public FuelTank(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.remainingFuel = 0;
    }

    //gettery settery
    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void reportRemainingFuel() {
        System.out.println("Remaining fuel: " + remainingFuel + "/" + totalCapacity);
    }

    public void addFuel(int amount) {
        if (amount + remainingFuel > totalCapacity)
            throw new IllegalArgumentException("Not enough capacity! amount+remaining=" + (amount + remainingFuel) + ", totalCapacity=" + totalCapacity);
        remainingFuel += amount;
    }

    public void useFuel(int amount) {
        if (amount > remainingFuel)
            throw new IllegalArgumentException("Fuel tank i empty! Remaining fuel: " + remainingFuel + ", amount" + amount);
        remainingFuel -= amount;
    }


}
