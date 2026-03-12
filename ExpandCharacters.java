import java.util.Scanner;

public class ExpandCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string (e.g., a2b3c4): ");
        String input = sc.nextLine();

        StringBuilder output = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                i++;
                StringBuilder num = new StringBuilder();

                // Handle multiple digits after a character
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    num.append(input.charAt(i));
                    i++;
                }

                if (num.length() > 0) {
                    int count = Integer.parseInt(num.toString());
                    for (int j = 0; j < count; j++) {
                        output.append(ch);
                    }
                } else {
                    System.out.println("Invalid format: Missing digit after character " + ch);
                    return;
                }

            } else {
                System.out.println("Invalid format: Expected letter but found " + ch);
                return;
            }
        }

        System.out.println("Output: " + output.toString());
    }
}
