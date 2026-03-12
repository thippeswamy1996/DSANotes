public class ReverseWords {
    public static void main(String[] args) {
        String str = "automation with selenium";

        String reversed = reverseWords(str);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }
}
