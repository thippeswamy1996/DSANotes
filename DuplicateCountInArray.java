import java.util.*;

public class DuplicateCountInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 1, 2};
		int n=9;
		evenOdd(n);
        countDuplicates(arr);
    }

    static void countDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print duplicates only
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " is repeating " + entry.getValue() + " times");
            }
        }
    }
	static void evenOdd(int n){
		if(n%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
	
}

1)need to  Update test execution report for v2 testcases.
2)BIAS if any bug fixes re-test.
3)BPSO if any points done from SAT points need to be re-test.