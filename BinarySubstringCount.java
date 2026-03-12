public class BinarySubstringCount {
    public static void main(String[] args) {
        String str = "00100101";
        int count = countSubstrings(str);
        System.out.println("Number of substrings: " + count);
    }

    public static int countSubstrings(String str) {
        int ones = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                ones++;
            }
        }
        return (ones * (ones - 1)) / 2;
    }
}
