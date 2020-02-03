package t_tests.jUnit_2_primaryNumbers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class JunitMain_1_primaryNumbersTest {
    private Integer number;
    private Boolean result;

    public JunitMain_1_primaryNumbersTest(Integer number, Boolean result) {
        this.number = number;
        this.result = result;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        Object[][] data = {
                {2, true},
                {3, true},
                {5, true},
                {7, true},
                {11, true},
                {13, true},
                {17, true},
                {20, false},
        };

        return Arrays.asList(data);
    }

    @Test
    public void massTests() {
        assertTrue(result.equals(JunitMain_1_primaryNumbers.isPrimeNumber(number)));
    }

}

