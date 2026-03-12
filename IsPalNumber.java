public class IsPalNumber{
	public static void main(String []args){
		int x=121;
		boolean res=isPal(x);
		if(res==true){
			System.out.println("Is pal");
		}
		else{
			System.out.println("Is not pal");
		}
	}
	static boolean isPal(int x){
		
		int rev;
		while(x>0){
			int digit=x%10;
			rev=rev*10+digit;
			x=x/10;
		}
		return x==rev;
	}
}