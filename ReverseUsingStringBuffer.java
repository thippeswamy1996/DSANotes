public class ReverseUsingStringBuffer {
    public static void main(String[] args) {
        String input = "Hello Java";
        
        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed using StringBuffer: " + reversed);
    }
}
