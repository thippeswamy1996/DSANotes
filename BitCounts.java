import java.util.*;
public class BitCounts{
	public static void main(String []args){
		int a=5;
		int count=Integer.bitCount(a);
		String b=Integer.toBinaryString(a);
		String n=String.valueOf(a);
		System.out.println(count);
		System.out.println(b);
		System.out.println(n);
		/*for(int i=0;i<n.length();i++){
			System.out.println(i);
		}*/
		int c=12;
		int res=greater(a,c);
		System.out.println(res);
	}
	static int greater(int a,int b){
		return (a>b)?a:b;
	}
}