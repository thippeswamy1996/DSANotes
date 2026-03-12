import java.util.*;
public class Ntoone{
	public static void main(String []args){
		int a=5;
		ntoOne(a);
		onetoN(a);
	}
	static void  ntoOne(int n){
		if(n<=0){
			return ;
		}
		System.out.println(n);
		 ntoOne(n-1);
	}
	static void  onetoN(int n){
		if(n<=0){
			return ;
		}
		
		 onetoN(n-1);
		 System.out.println(n);
	}
}