package Lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

}

public class Exp3_methodReference {
    public static void main(String[] args) {
        // int[] arr = { 10 , 20 , 30 , 40 , 50};

        List<Integer> data = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(data);
        // data.stream().forEach(System.out::println);

        // Stream uses one thread --> Sequential

        // enhanced for loop is been used in the forEach method

        // for (int dt : data) {
        //     System.out.println(dt);
        // }

        Employee emp1 = new Employee(101, "Shruthi");
        Employee emp2 = new Employee(101, "Sundari");

        List<Employee> listEmp = Arrays.asList(emp1, emp2);
        // listEmp.forEach(System.out.println(Employee::getId + "  " + Employee::getName));

        listEmp.forEach(dt -> System.out.println(dt));
        // listEmp.stream().map(x -> x.getName()).forEach(System.out::println);

    }
}
