import java.util.*;

public class FrequencyCountss {

    public static void main(String[] args) {
        String s = "Hello thippesh";
        fre(s);
    }

    static void fre(String s) {
   s=s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
