package Arrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        /*
         Print the index of the required number in a given array. If the number 
         is not present then print -1.
         */

         Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
}
