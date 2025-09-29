package Stack;

class CustomStack<T> {
    private T[] inputAr;
    private int top;
    private int capacity;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.inputAr = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T input) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        inputAr[top] = input;
        System.out.println("Pushed one record");
    }
    public T pop()
    {
        if(isEmpty()){
            System.out.println("Stack is Empty. Can't pop");
            return null;
        }
        T poprc = inputAr[top];
        inputAr[top] = null;

        top--;
        return poprc;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty. Can't find peek");
            return null;
        }
        return inputAr[top];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }

}

public class StackDemo {
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
        System.out.println("Full Checking " + obj1.isFull());

    }

}
