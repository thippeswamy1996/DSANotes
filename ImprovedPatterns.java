public class ImprovedPatterns {
    public static void main(String[] args) {
        String str = "ABCDEAERABCEABCD";
        String pat = "ABCD";

        int n = str.length();
        int m = pat.length();

        for (int i = 0; i <= n - m;) {
            int j;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                // Pattern fully matched
                System.out.println("Pattern found at index: " + i);
                i += 1; // You can change this to i += m if non-overlapping matches are okay
            } else if (j == 0) {
                i++;
            } else {
                i += j;
            }
        }
    }
}
