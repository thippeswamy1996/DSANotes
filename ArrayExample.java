public class ArrayExample {
    public static void main(String[] args) {
        int size = 100; // You can change the size as needed
        int[] arr = new int[size];

        // Storing 780 in all positions
        for (int i = 0; i < size; i++) {
            arr[i] = 780;
        }

        // Printing the array to verify
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
