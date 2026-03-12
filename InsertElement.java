public class InsertElement {
    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5}; // original array
        int x = 2;                // element to insert
        int index = 2;            // index at which to insert
        int n = arr.length;

        // Call insert method
        int[] newArr = insert(arr, n, x, index);

        // Print the new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] insert(int[] arr, int n, int x, int index) {
        // Create a new array of size n+1
        int[] newArr = new int[n + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i]; // copy elements before index
        }

        newArr[index] = x; // insert the new element

        for (int i = index; i < n; i++) {
            newArr[i + 1] = arr[i]; // shift the rest
        }

        return newArr;
    }
}
