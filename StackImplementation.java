import java.util.*;

public class StackImplementation {
    public static void main(String[] args) {
        String arr[] = {"abc", "def", "ghi"};
        String res[] = stackimp(arr);
        System.out.println(Arrays.toString(res));
    }

    static String[] stackimp(String arr[]) {
        Stack<String> stack = new Stack<>();

        // Push all elements into stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // Pop elements and store in result array
        String result[] = new String[arr.length];
        int i = 0;
        while (!stack.isEmpty()) {
            result[i++] = stack.pop();
        }

        return result;
    }
}
