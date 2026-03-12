import java.math.BigInteger;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        int n = 25;

        BigInteger result = factorial(n);
        System.out.println(n + "! = " + result);
        System.out.println("Trailing Zeros: " + trailingZero(n));
    }

    static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    static int trailingZero(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
