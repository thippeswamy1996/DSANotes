import java.util.*;
public class RotateAnarray{
	public static void main(String [] args){
	int arr[]={9,8,7,6,5,4,2,3,1,0};
	int res[]=rotate(arr);
	System.out.println(Arrays.toString(res));
	
}
static int[] rotate(int [] arr){
	int start=0;
	int high=arr.length-1;
	for(int i=start;i<high;i++){
		int temp=arr[start];
		arr[start]=arr[high];
		arr[high]=temp;
		start++;
		high--;
		
	}
	return arr;
}
}