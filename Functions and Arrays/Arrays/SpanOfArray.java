package Arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        /* You are given an array of length l. You have to find the span of array.
        Span is defined as difference of largest and smallest element in array.
        */ 

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = max(arr);
        int min = min(arr);
        System.out.println("Span is "+(max-min));
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
    public static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
