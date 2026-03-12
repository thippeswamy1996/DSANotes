import java.util.*;

public class Missing{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9, 0, 100};
        int n = arr.length;

        int min = arr[0];
        int max = arr[0];
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Missing numbers between " + min + " and " + max + ":");
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
