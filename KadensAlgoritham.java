import java.util.*;
public class KadensAlgoritham{
	public static void main(String[] args){
		int arr[]={2,4,5,6,7,-1,56};
		int res=kadens(arr);
		System.out.println(res);
	}
	public static int kadens(int arr[]){
		int maxEnding=arr[0];
		int res=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++){
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=Math.max(maxEnding,res);
		}
		return res;
	}
}