package collection;

import HackerEarth.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee("Shree", 10000),
                new Employee("Ram", 15000),
                new Employee("Lucky", 20000),
                new Employee("Raj", 220000));


      // empList = empList.stream().filter(e-> e.getSalary() >= 15000).collect(Collectors.toList());

      //  System.out.println(empList.toString());

        empList=  empList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() < o2.getSalary()) {
                    return 1;
                }
               else {
                    return -1;
                }
            }
        }).collect(Collectors.toList());

        System.out.println(empList);
    }
}
