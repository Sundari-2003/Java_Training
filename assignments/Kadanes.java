
public class Kadanes{
    private static int maximumSubarraySum(int[] arr , int n){
        int maximumSoFar = -99999;
        int sum = 0;
        int start = 0, ansStart= -1 , ansEnd = -1;

        for(int index = 0 ; index < n ; index++){
            if(sum == 0) start = index;
            sum += arr[index];

            if(sum > maximumSoFar) {
                maximumSoFar = sum;
                ansStart = start;
                ansEnd = index;
            }

            if(sum < 0) {
                sum = 0;
            }
        }
        if (ansStart != -1){
            for (int  i = ansStart ; i <= ansEnd ; i++) System.out.print(arr[i]+"  ");
        }
        System.out.println("\n");
        return maximumSoFar;
    }
    public static void main(String[] args) {
        int[] arr = {-2 , 4 , -3 , 10};
        int N = arr.length;
        System.out.println("The maximum subarray sum is: " + maximumSubarraySum(arr,N));
    }
}