public class OuterClass {
    interface NestedInterface {
        void display();
    }
}

class Implementer implements OuterClass.NestedInterface {
    public void display() {
        System.out.println("Nested Interface Implemented!");
    }

    public static void main(String[] args) {
        Implementer obj = new Implementer();
        obj.display();
    }
}
