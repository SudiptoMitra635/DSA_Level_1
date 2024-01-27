package Arrays;

import java.util.Scanner;

public class SubarrayOfArray {
    public static void main(String[] args) {
        /* You are given an array arr. And you have to print the subarrays.
           For example: arr = 1,2,3
                        Output: 1
                                1,2
                                1,2,3
         */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    for(int j =0; j<arr.length;j++){
        for (int i = 0; i <=j; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    }
}
