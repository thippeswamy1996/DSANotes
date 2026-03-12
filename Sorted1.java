public class Sorted1{
public static void main(String [] args){
 int [] arr= {2,4,6,7,8,9,10,3};
 boolean res=sort(arr);
 if(res==true){
 System.out.println("The given array is sorted");}
 else{
  System.out.println("The given array is not sorted");
 }
  }
  public static boolean sort(int[] arr){
    int n=arr.length;
	for(int i=1;i<n;i++){
	
	if(arr[i]<arr[i-1]){
	return false;
	
	}
	}
	return true;
	}}