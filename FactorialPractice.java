public class FactorialPractice{
	public static void main(String[] args){
		int n=5;
		int res=facttorial(n);
		System.out.println(res);
		int m=4;
		int res2=facttorial2(m);
		System.out.println(res2);
	}
	static int facttorial(int n){
		if(n==0||n==1){
			return 1;
		}
		return n*facttorial(n-1);
	}
	static int facttorial2(int m){
		int res=1;
		for(int i=2;i<=m;i++){
			res*=i;
		}
		return res;
	}
	
}