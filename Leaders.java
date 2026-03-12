import java.util.*;
public class Leaders{
public static void main(String[] args){
	int arr[] ={555555,33313,55555,17,3,4,5,2,333,1};
	
	//ArrayList<Integer> result=leader(arr);
	int res2=leader(arr);
	System.out.print(res2+"  ");
	}
	/*for(int res:result){
		System.out.print(res+"  ");
	}*/
	//System.out.println();

	static int  leader(int arr[]){
		ArrayList<Integer> result= new ArrayList<>();
		int n=arr.length;
		int maxending=arr[n-1];
		result.add(maxending);
		int count =1;
		for(int i=n-2;i>=0;i--){
			if(arr[i]>=maxending){
				count++;
				maxending=arr[i];
				result.add(maxending);
				
			}
		}
		
		//Collections.reverse(result);
		return count;
	}
}
