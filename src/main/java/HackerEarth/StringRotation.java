package HackerEarth;

public class StringRotation {



    public static void main(String[] args) {
        String str = "abcdefg";

       stringRotate(str);
    }

    private static void stringRotate(String str) {

       char[] charArray = str.toCharArray();

       for(int i=charArray.length-1 ; i>=0; i--){

        System.out.print(charArray[i]);
       }
    }
}
