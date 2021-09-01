package HackerEarth;

import java.util.Arrays;

public class WordReverse {

    public static void main(String[] args) {
        String str = "Hello String word";

        reverseWord(str);
    }

    private static void reverseWord(String str) {

        String[] strArray = str.split("\\s+");

        for(int i =0; i <= strArray.length/2; i++){

            String temp = strArray[i];
            strArray[i] = strArray[strArray.length-1-i];
            strArray[strArray.length-1-i] = temp;
        }
        System.out.println("reverse array " + Arrays.toString(strArray));

    }
}
