package d_advanced_generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericsMain {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<String> stringList
                = GenericsMain.fromArrayToList(intArray, Object::toString);
        stringList.forEach(System.out::println);
    }
    public static <T extends Number & Comparable, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {

        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

}
