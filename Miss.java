import java.util.*;
public class Miss{
public static void main(String [] args){
   int [] arr ={2,3,5,7,8,9,0,100};
   int n=arr.length;
   int max=arr[0];
   int min=arr[0];
   Set<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
			}
              }
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
			}
               }
    for(int num:arr){
            set.add(num);
            }
    for(int i=min;i<max;i++){
        if(!set.contains(i)){
	     System.out.print(" "+i);
	   }
      } 

}}