import java.util.*;
public class TwoSUms{
public static void main(String [] args){
	int arr[]={2,7,2,7,2};
	int target=9;
	int res[]=twoSUm(arr,target);
	System.out.println(Arrays.toString(res));
	
}

static int[] twoSUm(int arr[] ,int target){
	Map<Integer, Integer> map = new HashMap<>();
	int n=arr.length;
	for(int i=0;i<n;i++){
		int c=target-arr[i];
		if(map.containsKey(c)){
			return new int []{map.get(c),i};
		}
		map.put(arr[i],i);
	}
	return new int []{};
}

}