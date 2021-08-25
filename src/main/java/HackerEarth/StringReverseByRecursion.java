package HackerEarth;

public class StringReverseByRecursion {

    public static void main(String[] args) {
        String str = "Hello String ";

        String reverse = stringReverseByRecursion(str);

        System.out.println(reverse);
    }

    private static String stringReverseByRecursion(String str) {

        if(str == null || str.length() <=0){
            return str;
        }

        return stringReverseByRecursion(str.substring(1)) + str.charAt(0);
    }
}
