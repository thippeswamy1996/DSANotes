import java.util.*;
public class SelectionSort{
	public static void main(String[]args){
		int arr[]={9,1,0,2,3,4,5,6,7,8,11,12};
		int res[]=selectionSort((arr));
		System.out.println(Arrays.toString(res));
	}
	static int[] selectionSort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int minIdx=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[minIdx]){
					minIdx=j;
				}
				
				
			}
			int temp=arr[minIdx];
				arr[minIdx]=arr[i];
				arr[i]=temp;
		}
		return arr;
	}
}