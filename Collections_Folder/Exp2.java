package Collections_Folder;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student() {
    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        // return this.id - o.id; // ascending order
        return o.id - this.id; // Descending order
        // return this.name.compareTo(o.name); // Ascending order by name
    }
}
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");
        return o1.getName().compareTo(o2.getName());
    }
    
}  
    
public class Exp2 {
    public static void main(String[] args) {
        TreeSet<Student> data = new TreeSet<>(new NameComparator());
        data.add(new Student(1, "Rohit" , 22));
        data.add(new Student(3, "SKY" , 22));
        data.add(new Student(2, "Dhoni" , 22));

        Iterator<Student> itr  = data.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
