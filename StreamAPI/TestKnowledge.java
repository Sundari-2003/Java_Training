//Store the Employees records in the set interface and 
//Use Stream API for:
//find the count, 
//print in the sorting manner 
//ex: id sorting , name sorting

package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + salary;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    

}

public class TestKnowledge {
    public static void main(String[] args) {

        Set<Employee> empData = new HashSet<>(Arrays.asList(
                new Employee(5, "Aarvin", 123),
                new Employee(2, "Aarav", 234),
                new Employee(6, "Ishaan", 234),
                new Employee(7, "Shiv", 234),
                new Employee(4, "Kailash", 234)));

        System.out.println("The total number of Employee record: " +
                empData.stream().count());
        empData.stream()
                .sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName)
                        .thenComparing(Employee::getSalary))
                .forEach(emp -> System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getSalary()));
        System.out.println("The Find First answer is: " +
                empData.stream().findFirst());

        System.out.println("Parallel Stream function: " +
                empData.parallelStream().findFirst());

        System.out.println("Find Any: " +
                empData.stream().findAny());
        System.out.println("Parallel Stream findAny: " +
                empData.parallelStream().findAny());

    }

}
