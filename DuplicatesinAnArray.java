import java.util.Arrays;
public class DuplicatesinAnArray{
   public static void main (String[] args){
   int [] arr ={2,3,4,3,3,2,1,6};
   Arrays.sort(arr);
   int i;
   int  result=duplicate(arr);
   for(i=0;i<result;i++){
	 System.out.println(arr[i]);  
   }
System.out.println(arr[i].toCharArray()); 
System.out.println(result);
  }
  public static int duplicate(int [] arr){
	  int res=1;
      for(int i=1;i<arr.length;i++)
	  {
             if(arr[i]!=arr[res-1])
			 {
               arr[res]=arr[i];
               res++;
             }
  
       }
             return res;
   }
  }