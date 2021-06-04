import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {

        // Palindrome Number program

        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter the Number:-");
        // int n = in.nextInt();
        // int copyN = n;
        // int reverse = 0;
        // while (copyN != 0) {
        // int d = copyN % 10;
        // copyN /= 10;
        // reverse = reverse * 10 + d;
        // }

        // if (reverse == n) {
        // System.out.println("A Palindrome Number");
        // } else {
        // System.out.println("Not a Palindrome Number");
        // }

        // Armstrong Number program

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int n = in.nextInt();
        int copyN = n;
        int result = 0;
        int length = String.valueOf(n).length();

        while (copyN != 0) {
        int d = copyN % 10;
        copyN /= 10;
        result += Math.pow(d, length);
        }

        if (result == n) {
        System.out.println("Is Armstrong Number");
        } else {
        System.out.println("Not a Armstrong Number");
        }

        // Fibonacci Series

        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter the Number:-");
        // int j = in.nextInt();
        // int t1 = 0, t2 = 1;
        // System.out.println("First " + j + " terms: ");

        // for (int i = 1; i <= j; ++i) {
        //     System.out.print(t1 + "  ");

        //     int sum = t1 + t2;
        //     t1 = t2;
        //     t2 = sum;
        // }

    }
}
