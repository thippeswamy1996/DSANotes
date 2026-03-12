import java.util.*;
public class MergerArray{
	public static void main(String[]args){
		int arr1[]={1,2,3,4};
		int arr2[]={5,6,7,8};
		int res[]=merger(arr1,arr2);
		System.out.println(Arrays.toString(res));
	}
	static int[] merger(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		int merger[]= new int[n+m];
		int i=0,j=0,k=0;
		while( i<n &&j<m){
			if(arr1[i]<arr2[j]){
			merger[k++]=arr1[i++];
			}
			else{
			merger[k++]=arr2[j++];
		}
		}
		
		while(i<n){
			merger[k++]=arr1[i++];
			}
			while (j<m){
				merger[k++]=arr2[j++];
			}
			return merger;
	}
}