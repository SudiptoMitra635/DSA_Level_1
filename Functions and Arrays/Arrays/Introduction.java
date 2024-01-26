package Arrays;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        // Declaration of array
        int[] marks;

        // Space allocation
        marks = new int[5];

        // Adding elements in array with for loop
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Printing elements of array
        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }
    }
}
