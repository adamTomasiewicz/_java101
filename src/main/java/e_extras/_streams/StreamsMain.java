package e_extras._streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMain {
    public static void main(String[] args) {

        Integer[] integerTable = new Integer[]{1, 2, 3, 4, 5};

        System.out.println(fromArrayToList(integerTable));

    }


    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
}
