package e_extras._lambda;

@FunctionalInterface
public interface MyFunctionalInterface<T> {

    T countChars(String arg);

    default String getEmptyString() {
        return "";
    }
}
