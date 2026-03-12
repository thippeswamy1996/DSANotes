public class ReverseOnlyStrings {
    public static void main(String[] args) {
        String input = "123abc456xyz";
        StringBuilder output = new StringBuilder();

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If it's a letter, collect it
            if (Character.isLetter(ch)) {
                temp.append(ch);
            } else {
                // If we collected letters before, reverse and add them to output
                if (temp.length() > 0) {
                    output.append(temp.reverse());
                    temp.setLength(0); // clear temp
                }
                output.append(ch); // add the digit
            }
        }

        // At the end, check if any remaining letters
        if (temp.length() > 0) {
            output.append(temp.reverse());
        }

        System.out.println("Output: " + output.toString());
    }
}
