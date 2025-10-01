package Searching;


public class LinearSearch {
    public static int LinearSearchElement(int[] arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(target == arr[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] input = {34, 7, 23, 32, 5, 62};
        int target = 55;
        System.out.println( target +" is at: " + LinearSearchElement(input, target));
    }
}
