package Lambda_expression;

interface FunInf {
    void greet();
}

public class Exp1 {
    public static void main(String[] args) {
        FunInf obj1 = new FunInf() {
            @Override
            public void greet() {
                System.out.println("Functional Interface is created using anonymous inner class");
            }
        };
        obj1.greet();

        // 2. Nameless Object
        new FunInf() {
            @Override
            public void greet() {
                System.out.println("Nameless obj");
            }
        }.greet();

        // From JDK8 -> Lambda expression
        // -> represent anonymous inner class

        FunInf obj2 = () -> {
            System.out.println("Lamba Expression");
        };
        obj2.greet();
    }
}
