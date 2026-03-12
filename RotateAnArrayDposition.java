import java.util.Arrays;

public class RotateAnArrayDposition {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int d = 4;

        int res[] = rotate(arr, d);
        System.out.println(Arrays.toString(res));
    }

    static int[] rotate(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        int cycles = gcd(n, d);

        for (int i = 0; i < cycles; i++) {
            int temp = arr[i];
            int cur = i;

            while (true) {
                int next = (cur + d) % n;
                if (next == i)
                    break;

                arr[cur] = arr[next];
                cur = next;
            }
            arr[cur] = temp;
        }
        return arr;
    }

    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
