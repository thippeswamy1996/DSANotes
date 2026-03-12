import java.util.*;

public class MultipleMissing {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int n = 6;

        findMissing(arr, n);
    }

    static void findMissing(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];

        // mark existing numbers
        for (int num : arr) {
            present[num] = true;
        }

        // find missing
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println(i);
            }
        }
    }
}
