import java.util.*;
public class ReverseArr{
	public static void main(String []args){
		int arr[]={1,2,3,4,5,6};
		int d=2;
		int res[]=revarse(arr,d);
		System.out.println(Arrays.toString(res));
	}
	static int[] revarse(int arr[], int d){
		int n=arr.length;
		d%=n;
		rev(arr,0,d-1);
		rev(arr,d,n-1);
		rev(arr,0,n-1);
	return arr;	
	}
	static void rev(int arr[],int i,int j){
		while(i<j){
			int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
		
	}
}