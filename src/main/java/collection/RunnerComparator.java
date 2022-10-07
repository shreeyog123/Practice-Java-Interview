package collection;

import HackerEarth.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerComparator {

    public static void main(String[] args) {


        List<Laptop> laptopList = Arrays.asList(new Laptop("Acer", 8, 40000),
                new Laptop("Dell", 4, 90000),
                new Laptop("HP", 6, 45000),
                new Laptop("Apple", 4, 80000));

        /*Comparator<Laptop> c = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getRam() < o2.getRam()) {
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };*/

        Comparator<Laptop> c = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
               return o1.getBrandName().compareTo(o2.getBrandName());
            }
        };
        laptopList.sort(c);
        System.out.println(laptopList);
    }
}
