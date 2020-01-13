package c_core_exceptions;

public class NoAvailableCarException extends Exception{
    private final String rentalName;

    public NoAvailableCarException(String rentalName) {
        this.rentalName = rentalName;
    }

    @Override
    public String toString() {
        return super.toString() + "rentalName" + rentalName;
    }
}
