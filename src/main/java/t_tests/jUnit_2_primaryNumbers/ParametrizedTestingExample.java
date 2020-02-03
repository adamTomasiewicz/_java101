package t_tests.jUnit_2_primaryNumbers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ParametrizedTestingExample {

    public Integer liczba1;
    public Integer liczba2;
    public Boolean result;

    public ParametrizedTestingExample(Integer liczba1, Integer liczba2, Boolean result) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        Object[][] data = {
                {2, 4, true},
                {3, 1, true},
                {4, 3, false},
                {5, 4, false},
                {4, 3, false},
                {4, 3, false},
                {6, 4, true},
                {1, 3, true},
        };

        return Arrays.asList(data);
    }

    @Test
    public void massTests() {
        //assertTrue(result == ObliczeniaMatematyczne.czySumaParzysta(liczba1, liczba2));
    }


}