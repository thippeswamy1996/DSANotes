import java.util.ArrayList;

public class EvnOddArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 8};

        int[] evenNumbers = getEvenNumbers(arr);
        int[] oddNumbers = getOddNumbers(arr);

        System.out.print("Even Numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        System.out.print("\nOdd Numbers: ");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }

    static int[] getEvenNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }

        // Convert ArrayList to array
        int[] evenArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            evenArray[i] = list.get(i);
        }
        return evenArray;
    }

    static int[] getOddNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                list.add(num);
            }
        }

        // Convert ArrayList to array
        int[] oddArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            oddArray[i] = list.get(i);
        }
        return oddArray;
    }
}
