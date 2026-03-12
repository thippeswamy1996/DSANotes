import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int nums[] = {9, 8, 7, 6, 4};
        int res[] = reverse(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] reverse(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
