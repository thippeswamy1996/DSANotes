import java.util.*;

public class FirstRepeatedIndices {
    public static void main(String[] args) {
        String str = "abcabcaabbbbcc";
        int res = firstRepeatedIndex(str);
        System.out.println(res);
    }

    static int firstRepeatedIndex(String str) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (seen.contains(str.charAt(i))) {
                return i;
            } else {
                seen.add(str.charAt(i));
            }
        }
        return -1;
    }
}
