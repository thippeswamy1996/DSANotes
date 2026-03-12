import java.util.*;
public class BinarySearch{
	public static void main(String []args){
		int arr[]={1,2,3,4,55,555,3,-1};
		Arrays.sort(arr);
		int x=55;
		int res=binarySearch(arr,x);
		System.out.println(res);
	}
	static int binarySearch(int arr[] , int x){
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==x){
				return mid;
			}
			if(arr[mid]<x){
				l=mid+1;
			}
			else{
				r=mid-1;
			}
}
return -1;
		}	
	}
