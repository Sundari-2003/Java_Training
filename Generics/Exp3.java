package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Order<T>{
    private T item;

    public Order(T item) {
        this.item = item;
    }
    public T getItem(){
        return item;
    }
}
class Apple{

}

class Customer extends Order<Apple>{
    public Customer(Apple item){
        super(item);
    }

}
public class Exp3 {
    public static void main(String[] args) {
    // Bounded Wildcard Type

    // List<E> // Element type
    List<? super Integer> list = new ArrayList<>(); // Wildcard type
    list.add(1); // Can add upto integer, beyond that we cannot add!!!! MCQ will be asked from this
    list.add(2);
    list.add(3);
    System.out.println(list);  // For objects, Use the toString(). List only sout yields the output

    //Unbounded wildcard
    
    List<?> data = Arrays.asList(23,45,67,89);
    List<?> dataString = Arrays.asList("Java",23,45,67,89); // unbounded, so any type!!
    }

    
}
