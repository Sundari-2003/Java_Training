package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

public class Exp3 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Rohit" , "SKY" , "Kohli" , "Rahul" , "axar","Zero"); // axar is last since a ascii 97
        data.stream().sorted().forEach(x->System.out.println(x));
        data.stream().sorted().forEach(System.out::println);

        List<Employee> empData = Arrays.asList(
            new Employee(5, "Aarvin", 123),
            new Employee(2, "Aarav" , 234),
            new Employee(6, "Ishaan" , 234),
            new Employee(7, "Shiv" , 234),
            new Employee(4, "Kailash" , 234)
        );

        empData.stream().sorted(Comparator.comparing(Employee::getId)).forEach(emp -> System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getSalary()));
        empData.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee :: getName).thenComparing(Employee :: getSalary)).forEach(emp -> System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getSalary()));




    }

}
