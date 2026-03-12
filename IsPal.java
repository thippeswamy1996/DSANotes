public class IsPal{
	public static void main(String[]args){
		String s="Madam";
		boolean res=isPal(s);
		if(res==true){
			System.out.println("The given string is palindrome "+s);
			
		}
		else{
			System.out.println("The given string is not palindrome "+s);
		}
	}
	static boolean isPal(String s){
		int l=0,r=s.length()-1;
		s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
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