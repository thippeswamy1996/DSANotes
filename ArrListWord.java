import java.util.*;

public class ArrListWord {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("abc", "bcd", "efg"));

        // Get the last word
        int lastIndex = list.size() - 1;
        String lastWord = list.get(lastIndex);

        // Reverse the last word
        String reversedWord = new StringBuilder(lastWord).reverse().toString();

        // Update the list
        list.set(lastIndex, reversedWord);

        System.out.println(list);
    }
}
