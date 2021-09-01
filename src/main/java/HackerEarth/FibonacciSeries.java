package HackerEarth;

public class FibonacciSeries {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonacciSeriesForNumber(i));
        }
    }

    private static int fibonacciSeriesForNumber(int number) {

        int number1 = 1;
        int number2 = 1;

        int fibonacci = 1;

        if (number == 0 || number == 1)
            return fibonacci;

        for (int j = 3; j <= number; j++) {
            fibonacci = number1 + number2;
            number1 = number2;
            number2 = fibonacci;
        }

        return fibonacci;
    }
}
