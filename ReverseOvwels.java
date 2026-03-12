public class ReverseOvwels {
    public static void main(String[] args) {
        String s = "Thippeswamy";
		//thappeswimy"
		//  Tmapsepwihy
        String res = reverseOvwe(s);
        System.out.println(res);
    }

    static String reverseOvwe(String s) {
       
        char[] str = s.toCharArray();
		 int l = 0;
        int r = str.length - 1;

        while (l < r) {
            if (l < r && !isovwel(str[l])) {
                l++;
            }
            if (l < r && !isovwel(str[r])) {
                r--;
            }
            if (l < r) {
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
                l++;
                r--;
            }
        }
        return new String(str);
    }

    static boolean isovwel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u'
            || c == 'A' || c == 'E'
            || c == 'I' || c == 'O' || c == 'U';
    }
}
