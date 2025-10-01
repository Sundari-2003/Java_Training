package Sorting;

public class SelectionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            int minIndex = i;
            // Take the minimum value
            for(int j = i + 1 ; j < n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {50 , 20 , 30 , 40 , 10};
        System.out.println("Before sorting..");
        for(int x : arr){
            System.out.println(x);
        }
        System.out.println("After sorting..");
        sort(arr);
        for(int x : arr){
            System.out.println(x);
        }
    }
    
}
