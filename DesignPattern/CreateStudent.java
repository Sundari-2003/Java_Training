package DesignPattern;


public class CreateStudent {
    private StudentRepo repo;

    public CreateStudent(StudentRepo repo) {
        this.repo = repo;
    }

    public void create(Student student) {
        repo.addStudent(student);
    }
}
