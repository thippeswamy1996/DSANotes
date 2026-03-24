import java.util.*;
public class KadensTest{
	public static void main(String []args){
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int res=maxSum(arr);
		System.out.println(res);
		
	}
	static int maxSum(int arr[]){
		int res=arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<arr.length;i++){
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=Math.max(res,maxEnding);
		}
		return res;
	}
}