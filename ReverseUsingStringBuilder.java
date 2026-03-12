public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        String input = "Hello";
        
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed using StringBuilder: " + reversed);
    }
}
