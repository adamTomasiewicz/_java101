package b_javaBasics._date_and_time;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {

        int counter = 100_000;
        int[] buffer = new int[100_0000];

        Instant start = Instant.now();
        for (int i = 0; i < counter; i++) {
            buffer[i] = new Random().nextInt();
        }
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).getNano() + " ns");

    }

}
