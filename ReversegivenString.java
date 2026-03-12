public class ReversegivenString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder Reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse.append(str.charAt(i));
        }
        System.out.println(Reverse.toString());

    }

}
