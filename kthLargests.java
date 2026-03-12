import java.util.*;

public class KthLargests {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int k = 5;

        try {
            int res = kthLargest(arr, k);
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static int kthLargest(int[] arr, int k) {
        int n = arr.length;

        if (k > n || k <= 0) {
            throw new IllegalArgumentException("k must be between 1 and array length");
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : arr) {
            pq.add(val);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
