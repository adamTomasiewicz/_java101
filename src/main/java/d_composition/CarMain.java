package d_composition;

import d_composition.car.*;

class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(new Engine(150), new Wheels(), new GPS(),new FuelTank(50));

        if(car1.getRemainingFuel()<car1.getTotalCapacity())
            car1.addFuel(car1.getTotalCapacity()-car1.getRemainingFuel());
        car1.goTo("Kraków");

    }
}
