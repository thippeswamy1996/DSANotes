import java.util.*;
public class OneIndexTwoSum{
	public static void main(String[]args){
		int numbers[]={1,2,3,4,5,6,7,8,9};
		int target=13;
		int res[]=oneIndex(numbers,target);
		System.out.println(Arrays.toString(res));
	}
	static int[] oneIndex(int numbers[], int target){
		Arrays.sort(numbers);
		int l=0;
		int r=numbers.length-1;
		while(l<r){
			int sum=numbers[l]+numbers[r];
			if(sum==target){
				return new int []{l+1,r+1};
			}
			else if(sum<target){
				l++;
			}
			else{
			r--;}
		}
		return new int[]{-1,-1};
	}
}