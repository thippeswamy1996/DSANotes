public class ASCIITable {
    public static void main(String[] args) {
        System.out.println("ASCII Table (0 to 127):");
        System.out.println("-------------------------");
        System.out.printf("%-10s %-10s\n", "ASCII", "Character");

        for (int i = 0; i <= 127; i++) {
            char ch = (char) i;

            // Replace non-printable control characters with descriptions
            String displayChar;
            if (i < 32 || i == 127) {
                switch (i) {
                    case 0: displayChar = "NUL"; break;
                    case 1: displayChar = "SOH"; break;
                    case 2: displayChar = "STX"; break;
                    case 3: displayChar = "ETX"; break;
                    case 4: displayChar = "EOT"; break;
                    case 5: displayChar = "ENQ"; break;
                    case 6: displayChar = "ACK"; break;
                    case 7: displayChar = "BEL"; break;
                    case 8: displayChar = "BS"; break;
                    case 9: displayChar = "TAB"; break;
                    case 10: displayChar = "LF"; break;
                    case 11: displayChar = "VT"; break;
                    case 12: displayChar = "FF"; break;
                    case 13: displayChar = "CR"; break;
                    case 27: displayChar = "ESC"; break;
                    case 127: displayChar = "DEL"; break;
                    default: displayChar = "CTRL"; break;
                }
            } else {
                displayChar = Character.toString(ch);
            }

            System.out.printf("%-10d %-10s\n", i, displayChar);
        }
    }
}
