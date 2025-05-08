import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ i ^ arr[i];
        }
        xor = xor ^ n;

        System.out.println("Missing number is: " + xor);
        sc.close();
    }
}
