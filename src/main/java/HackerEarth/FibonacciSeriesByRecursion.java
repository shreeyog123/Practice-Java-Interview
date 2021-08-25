package HackerEarth;

public class FibonacciSeriesByRecursion {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonacciSeriesByRecursion(i));
        }

    }

    private static int fibonacciSeriesByRecursion(int number) {

        if(number == 0 || number == 1){
            return 1;
        }

        return  fibonacciSeriesByRecursion(number - 1) + fibonacciSeriesByRecursion(number - 2);
    }
}
