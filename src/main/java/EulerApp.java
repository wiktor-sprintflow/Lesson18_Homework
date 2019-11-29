import euler2.Euler2;
import euler6.Euler6;

public class EulerApp {
    private static final int EULER2_UPPER_RANGE = 4000000;
    private static final int EULER6_UPPER_RANGE = 100;

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        System.out.println("Suma parzystych liczb ciągu wynosi: " + euler2.sumFibonacciEvenNumbers(EULER2_UPPER_RANGE));

        Euler6 euler6 = new Euler6();
        System.out.println("Różnica kwadratu sumy i sumy kwadratów wynosi: " + euler6.difference(EULER6_UPPER_RANGE));
    }
}
