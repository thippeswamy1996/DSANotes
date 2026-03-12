public class LexicoExample {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";
        
        // Using compareTo()
        int result = a.compareTo(b);

        if (result < 0) {
            System.out.println("\"" + a + "\" is lexicographically smaller than \"" + b + "\"");
        } else if (result > 0) {
            System.out.println("\"" + a + "\" is lexicographically greater than \"" + b + "\"");
        } else {
            System.out.println("\"" + a + "\" is equal to \"" + b + "\"");
        }
    }
}
