public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "how are you?";
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first character + rest of the word
                String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                output.append(capitalized).append(" ");
            }
        }

        // Remove trailing space and print
        System.out.println("Output: " + output.toString().trim());
    }
}
