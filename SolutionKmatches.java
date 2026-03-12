public class SolutionKmatches {
    final int MOD = 1_000_000_007;
    long[] fact;
    long[] invFact;

    public int countGoodArrays(int n, int m, int k) {
        precomputeFactorials(n);
        long combinations = nCr(n - 1, k);
        long result = combinations * m % MOD;
        result = result * modPow(m - 1, n - k - 1) % MOD;
        return (int) result;
    }

    // Precompute factorials and their modular inverses
    void precomputeFactorials(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        fact[0] = invFact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        for (int i = 0; i <= n; i++) {
            invFact[i] = modInverse(fact[i]);
        }
    }

    // nCr = fact[n] / (fact[r] * fact[n-r]) % MOD
    long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    // Modular inverse using Fermat's Little Theorem
    long modInverse(long a) {
        return modPow(a, MOD - 2);
    }

    // Fast modular exponentiation
    long modPow(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = result * base % MOD;
            }
            base = base * base % MOD;
            exp >>= 1;
        }
        return result;
    }
}
