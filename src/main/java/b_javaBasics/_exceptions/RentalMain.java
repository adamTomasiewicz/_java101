package pl.adamTomasiewicz.c_programator.j_exceptions;

import java.util.ArrayList;
import java.util.List;

public class RentalMain {

    private static List<String> cars = new ArrayList<>();


    public static void main(String[] args) {
        try {
            getAvailableCars("ABC Rentals S.A.");
        } catch (NoAvailableCarException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> getAvailableCars(String rentalName) throws NoAvailableCarException {
        if (cars.isEmpty()) {
            throw new NoAvailableCarException(rentalName);
        }
        return cars;
    }
}
