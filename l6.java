import java.util.*;

public class l6 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int m = sc.nextInt();

        // Butterfly pattern
        // upper half
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // lower half
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // solid rhombus
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // stars
        // for (int j = 1; j <= n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // number pyramid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // palindromic pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // first half
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }

        // // second half
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // diamond pattern
        int n = 4;
        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
