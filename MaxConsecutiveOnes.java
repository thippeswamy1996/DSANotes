public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, d);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1}; // Sample input
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1's: " + result); // Output: 3
    }
}
