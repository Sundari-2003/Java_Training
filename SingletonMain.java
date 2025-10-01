class Singleton {
    // Step 2: Private static instance
    private static Singleton instance;

    // Step 1: Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Public method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create only once
        }
        return instance;
    }
}
public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // true — same instance
    }
}
