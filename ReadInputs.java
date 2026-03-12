import java.util.*;

public class ReadInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first number
        System.out.println("Please enter number1:");
        int num1 = sc.nextInt();

        // Read second number
        System.out.println("Please enter number2:");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;
        System.out.println("The sum of the entered two numbers is: " + sum);

        // Clear the buffer before reading nextLine after nextInt or nextDouble
        sc.nextLine();  // Consume the newline character left by nextInt()

        // Read full text line
        System.out.println("Please enter a text line:");
        String a = sc.nextLine(); // Reads a full line of text

        // Read decimal number
        System.out.println("Please enter a decimal number:");
        Double db = sc.nextDouble(); // Reads a decimal number

        // Read a single word (no spaces)
        sc.nextLine(); // Consume the newline character left by nextDouble()
        System.out.println("Please enter a single word:");
        String ab = sc.next(); // Reads a single word

        // Display the input values
        System.out.println("Text line: " + a);
        System.out.println("Decimal number: " + db);
        System.out.println("Single word: " + ab);

        // Close the scanner
        sc.close();
    }
}
