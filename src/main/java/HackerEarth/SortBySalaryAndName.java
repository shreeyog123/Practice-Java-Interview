package HackerEarth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortBySalaryAndName {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Front",1000000));
        employeeList.add(new Employee("Jon",2000000));

        employeeList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getEmpName));



    }


}
