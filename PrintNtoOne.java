public class PrintNtoOne{
	public static void main(String [] args){
		int N=10;
		printNtoOne(N);
		
	}
	public static void printNtoOne(int N){
		if(N==0){
			return;
		}
		System.out.print(" " +N);
		printNtoOne(N-1);
		
		
		return;
	}
	
}