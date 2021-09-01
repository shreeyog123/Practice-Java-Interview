package mettle;

public class StringPractice {

    public static void main(String[] args) {
        String str = new String("Worldline");
        str.concat("Global");
        System.out.println(str);

        StringBuffer sb = new StringBuffer("Worldline");
        sb.append("Global");
        System.out.println(sb);

        String s1 = new String("Worldline");
        String s2 = new String("Worldline");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
