package b_javaBasics.methods;

public class B_Methods {
    //THEORY
    //recursion
    //void
    //arguments and overloading

    static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        }
        return n;
    }

    //EXERCISES
//exercise 1:
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
