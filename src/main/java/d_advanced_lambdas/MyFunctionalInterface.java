package d_advanced_lambdas;

@FunctionalInterface
public interface MyFunctionalInterface<T> {

    T countChars(String arg);

    default String getEmptyString() {
        return "";
    }
}
