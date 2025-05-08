import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;

        while(temp != 0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (reverse == num){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
