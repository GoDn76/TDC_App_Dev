// a.) WAP to print Fibonacci Series till nth-term.

import java.util.Scanner;

public class Fib {
    public static long[] fib(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Fibonacci series : [");
        for(long n : fib(num)) {
            System.out.print(n + " ");
        }
        System.out.println("]");
    }
}
