package euler2;

public class Euler2 {

    public int sumFibonacciEvenNumbers(int upperRange) {
        int sum = 0;
        int previous = 1;
        int next = 2;
        int tmp;
        while (previous <= upperRange) {
            if (previous % 2 == 0) {
                sum += previous;
            }
            tmp = previous + next;
            previous = next;
            next = tmp;
        }
        return sum;
    }
}
