package Collections_Folder;
import java.util.HashSet;


public class Exp1 {
    public static void main(String[] args) {
        HashSet<Employee> data = new HashSet<>();
        data.add(new Employee(1, "Rohit"));
        data.add(new Employee(1, "Rohit"));
        System.out.println(data.size());

    }
}
