public class PreSuma {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int[] res = prefixSum(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    static int[] prefixSum(int arr[]) {
        int n = arr.length;
        int[] presum = new int[n];
        presum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            presum[i] = presum[i - 1] + arr[i];
        }
        return presum;
    }
}
