import java.util.*;

public class KadensAlgo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int res = kadensMaxSum(arr);
        System.out.println(res);
    }

    static int kadensMaxSum(int arr[]) {
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
