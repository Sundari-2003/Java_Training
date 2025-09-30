package Sorting;

import java.util.Arrays;

public class Exp1 {
    public static void main(String[] args) {
        int[] arr = { 60, 'a', 80, 30, 'b', 'z', 50, 'j', 5 };
        for (int x : arr)
            System.out.println(x);
        Arrays.sort(arr);
        for (int x : arr)
            System.out.println(x);
        String str = Arrays.toString(arr);
        // Arrays.sort(str);
        System.out.println(str);
        String input = "23a3j4d53c6d";
        char[] ch = input.toCharArray();
        Arrays.sort(ch);

        for (char j : ch)
            System.out.print(" " + j);
        StringBuilder chs = new StringBuilder();
        StringBuilder nums = new StringBuilder();

        for (char j : ch) {
            if (Character.isLetter(j))
                chs.append(j);
            else if (Character.isDigit(j))
                nums.append(j);
        }
        System.out.println(chs + " " + nums);
    }

}
