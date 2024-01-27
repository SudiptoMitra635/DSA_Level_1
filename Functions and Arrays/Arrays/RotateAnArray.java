package Arrays;

import java.util.Scanner;

public class RotateAnArray {
public static void main(String[] args) {
    
    /* You are given a number n representing the size of array arr.
       You are given n numbers, representing elements of array arr.
       You are given a number k.
       Rotate the array arr, k times to the right if k is positive and to the
       left if k is negative.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();

    k %= n;
    
    if (k<0) {
        k+=n;
    }
    if (k!=0) {
        int index1 = 0;
        int index2 = arr.length-k;
        while (index1 != arr.length-1) {
            int temp = arr[index2];
            arr[index2] = arr[index1];
            arr[index1] = temp;
            index1++;
            if (index2!=arr.length-1) {
                index2++;
            }
        }
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

}
    
}
