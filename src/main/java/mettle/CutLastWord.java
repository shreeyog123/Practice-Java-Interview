package mettle;

public class CutLastWord {


    public static int cutWord(String inputString, int first, int second){
        String newString = "";
        int count =0;


        do{

            newString = extracted(inputString, first);
            count ++;

        }
        while (newString == inputString);

        return count;
    }

    private static String extracted(String inputString, int input) {
        String cut = inputString.substring(0, inputString.length()- input);
        String cutForAdd = inputString.substring(inputString.length()- input);

        return cutForAdd + cut ;
    }

    public static void main(String[] args) {

        System.out.println(CutLastWord.cutWord("abcdFG", 2, 1));
    }
}
