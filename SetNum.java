import java.util.*;
public class SetNum{
	public static void main(String[]args){
		int arr[]={1,2,3,3,3,4,5,66,66,66,7,7};
		Set<Integer> set = new HashSet<>();
		for(int num:arr){
			set.add(num);
			
		}
		System.out.println(set);
		int res[]=sort(set);
		System.out.println(set);
	}
	static void swap(int arr[],int i,int j){
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void sort(int arr[],int i,int j){
		for( i=0;i<arr.length;i++){
		for( j=1;j<arr.length-1;j++){
			if(arr[j]<arr[j-1]){
				swap(arr,i,j);
			}
		}
		}
	}
}