import java.util.ArrayList;
import java.util.Collections;

public class LeaderinArray{
	public static void main(String[]args){
		int arr[]= { 16, 17, 4, 3, 5, 2 };;
		ArrayList<Integer> result=leader(arr);
		for(int res:result){
			System.out.print(res+" ");
		}
		System.out.println();
	}
	static ArrayList<Integer> leader(int arr[]){
		ArrayList<Integer> result= new ArrayList<>();
		int n=arr.length;
		int maxEnding=arr[n-1];
		result.add(maxEnding);
		for(int i=n-2;i>=0;i--){
			if(arr[i]>=maxEnding){
				maxEnding=arr[i];
				result.add(maxEnding);
			}
			
		}
		Collections.reverse(result);
		return result;
		
	}
	
}