public class PrintNto1{
	public static void main(String[]args){
		int n=5;
		nth(n);
	}
	static void nth(int n){
		if(n>0){
		
		System.out.print(n+ " ");
			nth(n-1);
		
		
	}
	}
}