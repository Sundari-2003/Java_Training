package DesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRepo {
    private Map<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
        System.out.println(student.getName() + " is added successfully");
    }

    public Student readStudent(int id) {
        return studentMap.get(id);
    }

    public void updateStudent(Student student) {
        studentMap.put(student.getId(), student);
        System.out.println(student.getName() + " is updated successfully");
    }

    public void deleteStudent(int id) {
        studentMap.remove(id);
        System.out.println(id + "is deleted successfully");
    }

    public void printAllStudents() {
        for (Student student : studentMap.values()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", College: "
                    + student.getCollege() + ", City: " + student.getCity());
        }
    }

}
