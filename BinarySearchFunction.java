import java.util.*;
public class BinarySearchFunction{
	public static  void main(String []args){
		int arr[]={1,2,3,4,5,6,7,8,9};
		
		int x=8;
		int res=binarySearch(arr,x);
		System.out.println(res);
	}
	static int binarySearch(int arr[],int x){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==x){
				return mid;
				
			}
		else if(arr[mid]<x){
			low=mid+1;
		}else{
			high=mid-1;
		}
			
		}
		return -1;
	}
}