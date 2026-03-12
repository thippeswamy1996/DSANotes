import java.util.*;
public class RevArry{
	public static void main(String [] args){
		int arr[]={2,3,4,5,6,6,7,8,8};
	reverse(arr);
	System.out.println(Arrays.toString(arr));
	}
	static void reverse(int arr[]){
		 int l=0, r=arr.length-1;
		while(l<r){
			swap(arr,l,r);
			l++;
			r--;
		}
	}
	static void swap(int arr [], int i,int j){
		
			int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}
}