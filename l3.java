import java.util.*;

public class l3 {
    public static void main(String args[]) {
        // is a standard entry point for Java programs. When you run a Java application,
        // the JVM looks for this method and starts executing the code inside it.

        // initial => System.out.println("Hello, World!");

        // if else
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();

        // if (age < 18) {
        // System.out.println("Child");
        // } else {
        // System.out.println("Adult");
        // }

        // else if ladder
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        if (x == y) {
            System.out.println("Both are equal");
        } else if (x > y) {
            System.out.println("x > y");
        } else {
            System.out.println("y > x");
        }
    }
}