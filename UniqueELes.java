import java.util.*;

public class UniqueELes {
	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 5, 4, 3, 2, 6, 7 };
		ArrayList<Integer> li = new ArrayList<>();
		for (int num : arr) {
			if (!li.contains(num)) {
				li.add(num);
			}
		}
		System.out.println(li);
	}

}