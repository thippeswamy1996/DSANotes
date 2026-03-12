import java.util.*;

public class LeaderinAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 9,5, 6, 7, 2, 4};
        List<Integer> res = leader(arr);
        System.out.println(res);
    }

    static List<Integer> leader(int arr[]) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        int maxRight = arr[n - 1];   // last element is always a leader
        result.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }

        Collections.reverse(result);
        return result;
    }
}
