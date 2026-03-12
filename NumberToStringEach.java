public class NumberToStringEach {
    public static void main(String[] args) {
        int num = 12345;

        // Convert number to string
        String str = String.valueOf(num);

        // Print each character as a string in quotes
        for (int i = 0; i < str.length(); i++) {
            System.out.println("\"" + str.charAt(i) + "\"");
        }
    }
}
