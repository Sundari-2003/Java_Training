// package BridgeDesignPattern;

// interface StudentApi{
//     public void studentGrade(char grade);
// }

// abstract class StudentAbs{
//     public StudentApi api;

//     public StudentAbs(StudentApi api) {
//         this.api = api;
//     }
//     public abstract void studentMarks();
// }
// class StudentAbsImpl extends StudentAbs{
//     public StudentAbsImpl(StudentApi api){
//         super(api);
//     }

//     @Override
//     public void studentMarks() {
//         // TODO Auto-generated method stub
//         System.out.println("Convcrete class abs overrided");
//         api.studentGrade('A');
        
//     }
    
// }

// class Student1 implements  StudentApi{

//     @Override
//     public void studentGrade(char grade) {
//         // TODO Auto-generated method stub
//         System.out.println("Grade : " + grade);
        
//     }
    
// }

// class Student2 implements  StudentApi{

//     @Override
//     public void studentGrade(char grade) {
//         // TODO Auto-generated method stub
//         System.out.println("Grade : " + grade);
        
//     }
    
// }

// public class BridgeDP {
//     public static void main(String[] args) {
//         StudentAbs obj1 = new StudentAbsImpl(new Student1());
//         StudentAbs obj2 = new StudentAbsImpl(new Student2());
//         obj1.studentMarks();
//         obj2.studentMarks();

        
//     }
// }


package BridgeDesignPattern;

// Implementor Interface
interface StudentApi {
    void studentGrade(char grade);
}

// Abstraction
abstract class StudentAbs {
    protected StudentApi api;

    public StudentAbs(StudentApi api) {
        this.api = api;
    }

    public abstract void studentMarks();
}

// Refined Abstraction
class StudentAbsImpl extends StudentAbs {
    public StudentAbsImpl(StudentApi api) {
        super(api);
    }

    @Override
    public void studentMarks() {
        System.out.println("Concrete class overriding abstract method.");
        api.studentGrade('A');
    }
}

// Concrete Implementor 1
class Student1 implements StudentApi {
    @Override
    public void studentGrade(char grade) {
        System.out.println("Student1 Grade: " + grade);
    }
}

// Concrete Implementor 2
class Student2 implements StudentApi {
    @Override
    public void studentGrade(char grade) {
        System.out.println("Student2 Grade: " + grade);
    }
}

// Client
public class BridgeDP {
    public static void main(String[] args) {
        StudentAbs student1 = new StudentAbsImpl(new Student1());
        StudentAbs student2 = new StudentAbsImpl(new Student2());

        student1.studentMarks();
        student2.studentMarks();
    }
}