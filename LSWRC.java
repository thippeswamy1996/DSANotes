import java.util.*;

public class LSWRC {
    public static void main(String[] args) {
        String s = "Hello";
        int res = lsswrc(s);
        System.out.println("Longest substring without repeating character " + res);
    }

    static int lsswrc(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}