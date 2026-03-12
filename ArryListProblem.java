import java.util.*;
public class ArryListProblem{
	public static void main(String[] args){
		Integer arr[]={2,3,4,5,5};
		int k=4;
  System.out.println(Arrays.asList(arr));
  for(int i=0;i<arr.length;i++){
	  if(arr[i]==k){
		  System.out.println(i);
	  }
	  
  }
	}
   
   
}