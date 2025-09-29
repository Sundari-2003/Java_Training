package Stack;

import java.util.Stack;

public class Exp4 {
    public static void main(String[] args) {
        Stack data = new Stack<>();
        data.add("Java");
        data.add(300);
        data.add("java");
        data.add("mla");

        System.out.println(data.peek());
        System.out.println(data.pop());
        data.push("Spring");
        System.out.println("The stack reference variable is: " + data);
        System.out.println(data.search("mla"));

        data.clear(); // Empty the stack
        System.out.println( " Check if the stack is Empty: " + data.isEmpty());

    }
}
