public class Fibonachi{
	public static void main(String[]args){
		int n=10;
		int res=fibonachi(n);
		System.out.println(res);
	}
	static int fibonachi(int n){
		if(n<=1){
			return n;
		}
		return fibonachi(n-1)+fibonachi(n-2);
	}
}