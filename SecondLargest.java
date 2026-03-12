public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 22, 33, 44, 55, 66, 77, 88, 99};

        int max = arr[0];
        int secondMax = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest: " + secondMax);
    }
}
