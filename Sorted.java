public class Sorted{
public static void main(String [] args){
 int [] arr= {2,4,6,7,8,9,10};
 boolean res=sort(arr);
 if(res==true){
 System.out.println("The given array is sorted");}
 else{
  System.out.println("The given array is not sorted");
 }
  }
  public static boolean sort(int[] arr){
    int n=arr.length-1;
	for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
	if(arr[i]>arr[j+1]){
	return false;
	}
	}
	}
	return true;
	}}