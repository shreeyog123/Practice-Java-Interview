package HackerEarth;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int number[] = {1, 2, 4, 5, 6};

        reverseArray(number);

    }

    private static void reverseArray(int[] number) {

        for (int i = 0; i <= number.length / 2; i++) {

            int temp = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length - 1 - i] = temp;
        }

        System.out.println("reverse array " + Arrays.toString(number));
    }
}
