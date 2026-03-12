import java.util.*;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10,100};
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int i = 1; i <= 10; i++) {
            if (!set.contains(i)) {
                System.out.println("Missing number is: " + i);
                break;
            }
        }
    }
}
