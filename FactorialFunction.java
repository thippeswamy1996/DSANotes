public class FactorialFunction{
	public static void main(String[] args){
		int n=5;
		int res=factorial(n);
		System.out.println(res);
		int res2=factorialLoof(n);
		System.out.println(res2);
		
	}
	static int factorial(int n){
		if(n==0||n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
	static int factorialLoof(int n){
		int res=1,i;
		
		for( i=2;i<=n;i++){
			 res*=i;
		}
		return res;
	}
}