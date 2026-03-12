import java.util.*;
public class BubbleSortPractice{
	public static void main(String[]args){
		int arr[] ={1,9,19,10,2,3,4,8,7,6,52,0};
		int res[]=bubbleSOrtPractice(arr);
		System.out.println(Arrays.toString(res));
		
	}
	static int[] bubbleSOrtPractice(int arr[]){
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