import java.util.*;
public class UniqueinAnArr{
public static void main(String[] args){
	int arr[]={1,2,3,4,1,1,2,3,7,9,8};
	int res[] =unique(arr);
	System.out.println(Arrays.toString(res));
}
   static int[] unique(int arr[]){
	   Set<Integer> uniqueElement = new HashSet<>();
	   
	   //Set<Integer> uniqueElement = new LinkedHashSet<>();
	   for(int num:arr){
		   uniqueElement.add(num);
	   }
	   int result[] = new int[uniqueElement.size()];
	   int i=0;
	   for(int e:uniqueElement){
	   result[i++]=e;
	   }
	   return result;
   }}