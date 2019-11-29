package euler6;

public class Euler6 {
    public int difference(int number) {
        return squareOfSum(number) - sumOfSquares(number);
    }

    private int sumOfSquares(int number) {
        int counter = 1;
        int sum = 0;
        while (counter <= number) {
            sum += Math.pow(counter, 2);
            counter++;
        }
        return sum;
    }

    private int squareOfSum(int number) {
        int counter = 1;
        int sum = 0;
        while (counter <= number) {
            sum += counter;
            counter++;
        }
        return (int) Math.pow(sum, 2);
    }
}
