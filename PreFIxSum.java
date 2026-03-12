import java.util.*;
public class PreFixSum{
	public static void main(String []args){
		int arr[]={1,2,3,4,5,6};
		int res[]=prefixSum(arr);
		System.out.println(Arrays.toString(res));
	}
	

static int[] prefixSum(int arr[]) {
    int n = arr.length;
    int prefixSum[] = new int[n];

    prefixSum[0] = arr[0];

    for (int i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i - 1] + arr[i];
    }

    return prefixSum;
}
}