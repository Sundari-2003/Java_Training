package Stack;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class CustomStack<T> {
    private Node<T> top;
    private int size;

    public CustomStack(int capacity) {
        this.top = null;
        this.size = 0;
    }

    public void push(T input) {
        Node<T> newNode = new Node<>(input);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed one record");
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty. Can't pop");
            return null;
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty. Can't find peek");
            return null;
        }
        return top.data;
    }

    // public boolean isFull() {
    //     return top == capacity - 1;
    // }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

}

public class LinkedListDemo {
    public static void main(String[] args) {
        CustomStack<Integer> obj1 = new CustomStack<>(7);
        obj1.push(20);
        obj1.push(21);
        obj1.push(22);
        obj1.push(55);

        System.out.println("From Stack " + obj1.peek());

        obj1.pop();

        System.out.println("From Stack " + obj1.peek());
        System.out.println("Empty Checking " + obj1.isEmpty());
        // System.out.println("Full Checking " + obj1.isFull());

    }
}
