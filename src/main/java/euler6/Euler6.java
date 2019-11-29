package euler6;

public class Euler6 {
    public int difference(int number) {
        int counter = 1;
        int sumOfSquares = 0;
        int sum = 0;
        while (counter <= number) {
            sumOfSquares += Math.pow(counter, 2);
            sum += counter;
            counter++;
        }
        return (int) Math.pow(sum, 2) - sumOfSquares;
    }
}
