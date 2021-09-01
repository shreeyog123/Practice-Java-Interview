package HackerEarth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondMostSalary {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Front",1000000));
        employeeList.add(new Employee("Jon",2000000));

        Optional<Employee> emp = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println(emp.get().getSalary());
    }
}
