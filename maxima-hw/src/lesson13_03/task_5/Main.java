package lesson13_03.task_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Anna", 90_000);
        Employee emp2 = new Employee("Boris", 80_000);
        Employee emp3 = new Employee("Sergey", 95_000);
        Employee emp4 = new Employee("Maria", 83_000);

        List<Employee> empList = new ArrayList<>();
        Collections.addAll(empList, emp4, emp2, emp1, emp3);
        System.out.println("Натуральный порядок сортировки: ");
        Collections.sort(empList);
        System.out.println(empList);
        System.out.println();

        System.out.println("Сортировка с помощью Comparator по зарплате: ");
        empList.sort(new EmployeeSalaryComparator());
        System.out.println(empList);
        System.out.println();

        System.out.println("Натуральная сортировка древа: ");
        TreeSet<Employee> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, emp4, emp2, emp1, emp3);
        System.out.println(treeSet);
        System.out.println();
        System.out.println("Сортировка древа с помощью Comparator по зарплате: ");
        TreeSet<Employee> treeSet2 = new TreeSet<>(new EmployeeSalaryComparator());
        Collections.addAll(treeSet2, emp4, emp2, emp1, emp3);
        System.out.println(treeSet2);

    }
}
