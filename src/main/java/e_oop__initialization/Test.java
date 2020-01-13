package e_oop__initialization;

import java.util.Arrays;
import java.util.StringJoiner;

public class Test {
    private int field1;
    private double field2;
    private char field3;
    private String field4;
    private boolean field5;
    private Object field6;
    private int[] field7;

    @Override
    public String toString() {
        return new StringJoiner(", ", Test.class.getSimpleName() + "[", "]")
                .add("field1=" + field1)
                .add("field2=" + field2)
                .add("field3=" + field3)
                .add("field4='" + field4 + "'")
                .add("field5=" + field5)
                .add("field6=" + field6)
                .add("field7=" + Arrays.toString(field7))
                .toString();
    }
}
