import java.util.*;
public class BubbleSort{
	public static void main(String[]args){
		int arr[]={8,9,1,2,3,4,522,0};
		int res[]=bubbleSort(arr);
		System.out.println(Arrays.toString(res));
	}
	static int[] bubbleSort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
			}
		}
		return arr;
	}
	
}