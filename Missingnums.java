import java.util.*;
public class Missingnums{
	public static  void main(String[]args){
		int arr[]={2,3,4,5,6};
		int res=missing(arr);
		System.out.println(res);
	}
	static int missing(int arr[]){
		int n=arr.length+1;
		int xor1=0;
		int xor2=0;
		for(int i=1;i<=n;i++){
			xor1^=i;
		}
		for(int num:arr){
			xor2^=num;
		}
		return xor1^xor2;
		
	}
}