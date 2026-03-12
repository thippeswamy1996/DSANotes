public class Larage{
public static void main(String[] args){
 int[]  arr={2,4,34,44,2,1,0};
 int res=0;
 int i;
   for( i=0;i<arr.length;i++){
       if(arr[i]>arr[res]){
		   res=i;
        }
		}
		System.out.println(res);
		System.out.println(arr[res]);
    }
	 }