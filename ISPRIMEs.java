import java.util.*;
public class ISPRIMEs{
	public static void main(String [] args){
		int n=25;
		boolean res=isPrime(n);
		System.out.println(res);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=2;i<n;i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
		System.out.println(list);
	}
	static boolean  isPrime(int n){
		//int arr[]=new int[n];
		if(n<=1){
			return false;
		}
		if(n==2||n==3){
			return true;
		}
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}