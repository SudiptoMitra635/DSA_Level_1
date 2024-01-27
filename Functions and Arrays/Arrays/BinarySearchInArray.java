package Arrays;

import java.util.Scanner;

public class BinarySearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();

    // Binary Search Algorithm
    int low = 0;
    int high = arr.length-1;
    while (low<=high) {
        int mid =(low+high)/2;
        if (target > arr[mid]) {
            low = mid + 1; 
        }
        else if(target<arr[mid]){
            high = mid -1;
        }
        else{
            System.out.println(mid);
            return;
        }
    }
    System.out.println(-1);

    }
}
