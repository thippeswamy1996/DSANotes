public class IsPalCheck{
	public static void main(String [] args){
		String s="ABA";
		boolean res=isPal(s);
		if(res==true){
			System.out.println("The given string is palindrome");
		}
		else{
			System.out.println("The given string is not  palindrome");
		}
	}
	static boolean isPal(String s){
		int l=0;
		int r=s.length()-1;
		while(l<r){
			if(s.charAt(l)!=s.charAt(r)){
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}