public class VowelCounter {

     public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Hello World, Java is Awesome!";
        int vowelCount = countVowels(text);

        System.out.println("Input String: " + text);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
