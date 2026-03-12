public class ReverseVowelsInAString {
    public static void main(String[] args) {
        String s = "Hey";
        System.out.println(reverseVowels(s)); // Output: Hey (since only one vowel)
    }

    // Function to reverse vowels in a string
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;

        while (left < right) {
            // Move left pointer until we find a vowel
            while (left < right && !isVowel(str[left])) {
                left++;
            }
            // Move right pointer until we find a vowel
            while (left < right && !isVowel(str[right])) {
                right--;
            }
            // Swap vowels
            if (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }

        return new String(str);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
