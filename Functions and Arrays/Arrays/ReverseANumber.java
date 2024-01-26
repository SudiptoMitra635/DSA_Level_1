package Arrays;

import java.util.Scanner;

public class ReverseANumber {
    
    public static void main(String[] args) {
        /* Reverse the elements of the array */

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length-1;

        while (j>i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println(arr[j2]);
        }
    }
}
