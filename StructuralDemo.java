interface Target {
    public void request();
}

class Adaptee {
    public void specificRequest() {
        System.out.println("Simple Request");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    // @Override
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // TODO Auto-generated method stub
        adaptee.specificRequest();

    }

}

public class StructuralDemo {
    public static void main(String[] args) {
        Adaptee obj = new Adaptee();
        Adapter obj1 = new Adapter(obj);
        obj1.request();
    }
}

