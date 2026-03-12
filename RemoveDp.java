public class RemoveDp {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 5, 6};

        int res = dp(arr);
        System.out.println("Number of unique elements: " + res);

        System.out.print("Unique elements: ");
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int dp(int arr[]) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }

        int idx = 1; // Start from 1, since arr[0] is always unique
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i]; // Copy the unique element
            }
        }
        return idx;
    }
}
