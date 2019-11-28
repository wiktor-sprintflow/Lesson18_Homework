package euler2;

public class Euler2App {
    private static final int UPPER_RANGE = 4000000;

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        System.out.println(euler2.sumFibonacciEvenNumbers(UPPER_RANGE));
    }
}
