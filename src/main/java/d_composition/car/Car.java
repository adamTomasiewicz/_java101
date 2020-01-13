package d_composition.car;

import java.util.Random;

public class Car {
    private final Engine engine;
    private final Wheels wheels;
    private final GPS gps;
    private final FuelTank fuelTank;

    public Car(Engine engine, Wheels wheels, GPS gps, FuelTank fuelTank) {
        this.engine = engine;
        this.wheels = wheels;
        this.gps = gps;
        this.fuelTank = fuelTank;
    }

    public void goTo(String destination) {
        if (!engine.isStarted()) {
            engine.start();
        }
        wheels.turn(destination);
        while (!gps.isAt(destination)) {
            int fuelUsed = new Random().nextInt(4)+1;
            fuelTank.useFuel(fuelUsed);
            engine.giveFuel(fuelUsed);
            fuelTank.reportRemainingFuel();
            gps.updateLocation();
        }
        engine.stop();
        System.out.println("Arrived at: "+destination);
    }
    public int getTotalCapacity() {return fuelTank.getTotalCapacity();}
    public int getRemainingFuel() { return fuelTank.getRemainingFuel();}
public void addFuel(int amount){fuelTank.addFuel(amount);}
}
