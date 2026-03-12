import java.util.*;
public class DistinctinAnArray{
public static void main(String [] args){
int [] arr={2,3,4,2,3,5,6,7};
int  distincts =distinct(arr);
System.out.println(distincts);
}
public static int distinct(int [] arr){
  
   Set<Integer> set = new HashSet<>();
   
   for( int num:arr){
     set.add(num);
	 }
	 return set.size();
  
  }
}