public class AtoiConverter {

    public static int myAtoi(String s) {
        // Step 1: Remove leading whitespaces
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        .charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 2: Handle sign
        int sign = 1;
        if (i < n && (s// Step 3: Convert digits to number
        long result = 0; // Use long to avoid overflow during computation
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // Step 4: Clamp if out of bounds
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        // Step 5: Apply sign and return
        return (int) (sign * result);
    }

    // Test the function
    public static void main(String[] args) {
        System.out.println(myAtoi("   -42"));       // Output: -42
        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("words and 987"));   // Output: 0
        System.out.println(myAtoi("-91283472332"));    // Output: -2147483648
        System.out.println(myAtoi("+000123"));         // Output: 123
        System.out.println(myAtoi("   +0 123"));       // Output: 0
    }
}
