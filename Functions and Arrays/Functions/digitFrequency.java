package Functions;
import java.util.Scanner;

public class digitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        frequency(n,k);
    }

    public static void frequency(int i, int j){
        int count = 0;
        while (i!=0) {
            if (i%10==j) {
                count += 1;
            }
            i /= 10;
        }
        System.out.println(count);
    }
}