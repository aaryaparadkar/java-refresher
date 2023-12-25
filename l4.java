import java.util.*;

public class l4 {
    public static void main(String args[]) {
        // for loop
        // for (int counter = 0; counter < 10; counter++) {
        // System.out.println(counter);
        // }

        // while loop
        // int i = 0;
        // while (i < 10) {
        // System.out.println(i);
        // i++;
        // }

        // do while loop
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 10);

        // sum of n natural numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number upto which you need the sum: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // table of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose table you want: ");
        int n = sc.nextInt();
        int product = 0;
        for (int i = 1; i <= 10; i++) {
            product = i * n;
            System.out.println(product);
        }
    }
}
