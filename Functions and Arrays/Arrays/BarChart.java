package Arrays;

import java.util.Scanner;

public class BarChart {
    /*
     You are given an array with share prices, print the values as bar chart
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int rows = max(arr);
        int temp = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>=temp) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            temp--;
        }
     }

     public static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
