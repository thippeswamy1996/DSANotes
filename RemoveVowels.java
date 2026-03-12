public class RemoveVowels {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeVowels(input);
        System.out.println("Original String: " + input);
        System.out.println("String without vowels: " + result);
    }

    public static String removeVowels(String str) {
        return str.replaceAll("(?i)[aeiou]", ""); // ("(?i)[aeiou]","") makes it case-insensitive
    }
}
