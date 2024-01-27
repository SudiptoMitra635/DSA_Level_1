package Arrays;

import java.util.Scanner;

public class CeilAndFloor {
    //Find the ceil and floor of a number in a given array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int low =0;
    int high = arr.length-1;
    int ceil = 0;
    int floor = 0;
    while (low<=high) {
        int mid = (low+high)/2;
        if (target<arr[mid]) {
            high = mid-1;
            ceil = arr[mid];
        }
        else if (target>arr[mid]) {
            low = mid + 1;
            floor = arr[mid];
        }
        else {
            ceil = arr[mid];
            floor = arr[mid];
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
    }
}
