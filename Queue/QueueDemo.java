package Queue;

import java.util.Iterator;

class ArrayQueue<T> implements Iterable<T>{
    private T[] arrayQ;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;
    public ArrayQueue( int capacity) {
        this.capacity = capacity;
        this.arrayQ = (T[]) new Object[capacity];
        this.front = 0 ;
        this.rear = -1;
        this.currentSize = 0;    
    }
    public void enqueue(T input){
        if(isFull()) {
            System.out.println("Queue is Full cannot add the data");
            return;
        }
        rear = (rear + 1) % capacity;   // This is circular implementation. So % capacity.
        arrayQ[rear] = input;
        currentSize++;
        System.out.println("Added one record into the Queue!");
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is currently empty, cannot dequeue");
            return null; // Since there is no data
        }
        T removedData = arrayQ[front];
        arrayQ[front] = null; // remove the reference for the front;
        front = (front + 1 ) % capacity;
        currentSize--;
        System.out.println("One record is removed!");
        return removedData;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("empty queue. No peek!");
            return null;
        }
        return arrayQ[front];

    }
    public boolean isEmpty(){

        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == capacity;
    }

    public int size(){
        return currentSize;
    }
    
@Override
public Iterator<T> iterator() {
    return new Iterator<T>() {
        private int count = 0;
        private int index = front;

        @Override
        public boolean hasNext() {
            return count < currentSize;
        }

        @Override
        public T next() {
            T item = arrayQ[index];
            index = (index + 1) % capacity;
            count++;
            return item;
        }
    };
}


    
}
public class QueueDemo {
    public static void main(String[] args) {
        ArrayQueue<Integer> data = new ArrayQueue(5);
        // data.enqueue("Hi");
        data.enqueue(10);
        data.enqueue(11);
        data.dequeue();
        data.dequeue();
        data.dequeue();
        data.enqueue(10);
        data.enqueue(11);
        data.enqueue(12);
        data.enqueue(13);
        data.enqueue(14);
        data.enqueue(15);
        System.out.println("The peek element is : " + data.peek());
        data.dequeue();
        System.out.println("The peek element is : " + data.peek());
        System.out.println("Printing Data: " + data);

        for(int element : data) System.out.println(element);
    }
}
