
public class Fibonacci {

    public static int FibonacciUsingRecursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return FibonacciUsingRecursion(n - 1) + FibonacciUsingRecursion(n - 2);
        }
    }

    public static void FibonacciWithoutUsingRecursion(int n) {
        int first = 0, second = 1;

        // Handle the first two terms
        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }

        // Iterate and print the rest of the Fibonacci series
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci series using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciUsingRecursion(i) + " ");
        }

        System.out.println("\nFibonacci series without using recursion:");
        FibonacciWithoutUsingRecursion(n);
    }
}
