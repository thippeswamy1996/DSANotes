public class MissingNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6 };
        int n = arr.length;
        int expctedsum = n * (n + 1) / 2;
        int actualsum = 0;
        for (int num : arr) 
        {
            actualsum += num;
        }
        int missing = actualsum - expctedsum;
        System.out.println(missing);
    }
}