import java.util.*;
public class DistinctinAnArrayelements{
public static void main(String [] args){
int [] arr={2,3,4,2,3,5,6,7};
int [] distincts =distinct(arr);
System.out.println((Arrays.toString(distincts)));
}
public static int[] distinct(int [] arr){
  
   Set<Integer> set = new HashSet<>();
   
   for( int num:arr){
     set.add(num);
	 }
	 
	 int[] result = new int[set.size()];
	 int index=0;
	 for( int num:set){
		 result[index++]=num;
	 }
	 return result;
  
  }
}