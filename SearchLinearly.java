import java.util.Arrays;

public class SearchLinearly {

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 5, 2, 9, 7, 8};
        int k = 8;
         Arrays.sort(arr);
        int res = linearSearch(arr, k);
        System.out.println("Linear search index: " + res);

        Arrays.sort(arr); // mandatory for binary search

        int res2 = binarySearch(arr, k);
        System.out.println("Binary search index: " + res2);
    }

    static int linearSearch(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int x) {
        int low = 0;
        int high =arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

//{1, 3, 4, 5, 2, 9, 7, 8};
//{1,2,3,4,5,7,8,9};
