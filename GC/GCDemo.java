package GC;
class Employee{
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
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("The GC collected: "+ name);
        super.finalize();
    }
    
}

public class GCDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Shruthi");
        System.out.println("Employee : " + emp1.getId() + "  " + emp1.getName());
        emp1 = null;
        // System.gc();
        Runtime.getRuntime().gc();
        Employee emp2 = new Employee(101, "Shruthi");
        Employee emp3 = new Employee(101, "Shruthi");
        Employee emp4 = new Employee(101, "Shruthi");

        emp2 = null;
        emp3=null;
        emp4 = null;
        System.gc();

        System.runFinalization();
    }
    
}
