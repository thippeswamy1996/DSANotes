public class IsPrime{
	public static void main(String [] args){
		int n=9;
		 boolean res=isPrime(n);
		if(res==true){
			System.out.println("Is Prime");
		}
		else{
			System.out.println("Is not Prime");
		}
	}
	static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}