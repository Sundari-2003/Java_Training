//package taxapp.ui;
//
//import java.util.Scanner;
//
//public class WelcomeScreen {
//    private final Scanner scanner = new Scanner(System.in);
//    private final MainMenu mainMenu = new MainMenu();
//
//    public void show() {
//        System.out.println("+------------------------------------------+");
//        System.out.println("|         WELCOME TO TAX CALCULATION APP   |");
//        System.out.println("+------------------------------------------+");
//        System.out.println("PLEASE LOGIN TO CONTINUE\n");
//
//        String username;
//        String password;
//
//        while(true) {
//            System.out.print("USERNAME - ");
//            username = scanner.nextLine();
//            System.out.print("PASSWORD - ");
//            password = scanner.nextLine();
//
//            if (validate(username, password)) {
//                System.out.println("\nLogin successful.\n");
//                mainMenu.show();
//                break;
//            } else {
//                System.out.println("\nInvalid credentials. Please try again.\n");
//            }
//        }
//    }
//
//    private boolean validate(String username, String password) {
//        // Simple placeholder validation: user: admin, pass: admin123
//        return "admin".equalsIgnoreCase(username) && "admin123".equals(password);
//    }
//}


package taxapp.ui;

import java.util.Scanner;

public class WelcomeScreen {
    private final Scanner scanner = new Scanner(System.in);
    private final MainMenu mainMenu = new MainMenu();

    public void show() {
        System.out.println("===================================");
        System.out.println("       WELCOME TO TAX APP");
        System.out.println("===================================\n");

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        // For demo, accept any username/password
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or password cannot be empty. Please try again.\n");
            show();  // retry
        } else {
            System.out.println("\nLogin successful! Welcome, " + username + ".\n");
            mainMenu.show();
        }
    }
}
