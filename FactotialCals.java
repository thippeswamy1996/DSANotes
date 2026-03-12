public class FactorialCals {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial:");
        System.out.println(fact(n));

        System.out.println("Fibonacci:");
        System.out.println(fib(n));

        System.out.println("N to 1:");
        ntoOne(n);

        System.out.println("1 to N:");
        oneN(n);
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // Print N to 1
    static void ntoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        ntoOne(n - 1);
    }

    // Print 1 to N
    static void oneN(int n) {
        if (n == 0) {
            return;
        }
        oneN(n - 1);
        System.out.println(n);
    }
}