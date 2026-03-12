public class Arr{
public static void main(String [] args){
 int [] arr={2,4,3,5,6};
 int x=5;
 int res=arrposition(arr,x);
 System.out.println(res);
 }
 public static int arrposition(int [] arr, int x){
    for(int i=0;i<arr.length;i++){
	if(arr[i]==x){
	return  i;
	}}
	return -1;}
	}