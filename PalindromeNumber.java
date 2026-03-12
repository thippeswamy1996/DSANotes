import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;          // Get last digit
            reversed = reversed * 10 + digit; // Build reversed number
            num /= 10;                     // Remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is NOT a Palindrome Number.");
        }
    }
}
