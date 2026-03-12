import java.util.*;
public class Removedpfarr{
	public static void main(String [] args){
		int arr[]= {1,2,3,4,4,5,5,6,6,7,7,8,8};
		int res[]=unique(arr);
		System.out.println(Arrays.toString(res));
		
	}
	static int[] unique(int arr[]){
	Set<Integer> set= new HashSet<>();
	  for(int val:arr){

		  set.add(val);
	  }
	  int result[] = new int[set.size()];
	  int i=0;
	  for(int val:set){
		  result[i++]=val;
	  }
	  return result;
	}
}
//two sum in sorted array
