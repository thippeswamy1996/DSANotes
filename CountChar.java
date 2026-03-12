public class CountChar {
    public static void main(String[] args) {
        String str = "heyMyNameIs";
        int count = 0;

        // Count number of 'y'
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y') {
                count++;
            }
        }
        System.out.println("Count of 'y': " + count);

        // Find max and min in array
        int arr[] = {1, 2, 3, 4, 7, 5};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Reverse a string
        String strr = "Thippu";
        String rev = "";
        for (int i = strr.length() - 1; i >= 0; i--) {
            rev += strr.charAt(i);
        }
        System.out.println("Reversed string: " + rev);

        // Reverse a number
        int n = 129;
        int revs = 0;
        while (n != 0) {
            int digit = n % 10;
            revs = revs * 10 + digit; // Corrected logic
            n /= 10;
        }
        System.out.println("Reversed number: " + revs);
    }
}
