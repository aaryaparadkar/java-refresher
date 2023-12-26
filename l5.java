import java.util.*;

public class l5 {
    public static void main(String args[]) {
        // solid rectangle
        // int n = 4;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // hollow rectangle
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of stars horizontally: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of stars vertically: ");
        // int m = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
