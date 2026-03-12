public class StringPermutations {
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of " + input + ":");
        permute(input, 0, input.length() - 1);
    }

    // Recursive function to generate permutations
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i); // Swap current index with each
                permute(str, l + 1, r); // Recurse for the rest
                str = swap(str, l, i); // Backtrack
            }
        }
    }

    // Helper method to swap characters in a string
    public static String swap(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
