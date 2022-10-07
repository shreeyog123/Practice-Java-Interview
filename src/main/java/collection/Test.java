package collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");

        Iterator i = a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("B");

        HashSet<String> set=new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add(null);

        Iterator i2 = set.iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }





    }
}
