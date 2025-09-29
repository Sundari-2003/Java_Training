package DesignPattern;


public class StudentFacade {
    private CreateStudent create;
    // private ReadStudent read;
    // private UpdateStudent update;
    // private DeleteStudent delete;

    public StudentFacade(StudentRepo repo) {
        this.create = new CreateStudent(repo);
        // this.read = new ReadStudent(repo);
        // this.update = new UpdateStudent(repo);
        // this.delete = new DeleteStudent(repo);
    }

    public void createStudent(Student student) { create.create(student); }
    // public Student readStudent(int id) { return read.read(id); }
    // public void updateStudent(Student student) { update.update(student); }
    // public void deleteStudent(int id) { delete.delete(id); }
}
