public class RevarseaScentence{
	public static void main(String [] args){
		long n =291029293;
		System.out.println(digitalCount(n));
	}
	public static long digitalCount(long n){
		if(n/10==0)
		return 1;
		else
		return 1+digitalCount(n/10);
	}
	
	
}