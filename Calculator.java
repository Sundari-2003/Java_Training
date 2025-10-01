import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose operation: 1 for Add, 2 for Subtract, 3 for Multiply");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        sc.close();
    }
}