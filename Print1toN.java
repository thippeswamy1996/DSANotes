public class Print1toN{
	public static void main(String[]args){
		int n=5;
		nth(n);
	}
	static void nth(int n){
		if(n>0){
			nth(n-1);
		System.out.print(n+ " ");
		
		
	}
	}
}