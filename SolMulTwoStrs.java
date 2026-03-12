import java.util.Scanner;

class SolMulTwoStrs {
    public String multiply(String num1, String num2) {
        // Edge case
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length();
        int n = num2.length();
        
        // Result can be at most m+n digits
        int[] result = new int[m + n];

        // Multiply each digit
        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                
                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];

                result[i + j + 1] = sum % 10;             // Store unit place
                result[i + j] += sum / 10;                // Carry to next left
            }
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros
            if (sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        String num1 = sc.nextLine();
        
        System.out.print("Enter second number: ");
        String num2 = sc.nextLine();

        // Create object and call method
        SolMulTwoStrs sol = new SolMulTwoStrs();
        String result = sol.multiply(num1, num2);

        System.out.println("Product: " + result);

        sc.close();
    }
}
