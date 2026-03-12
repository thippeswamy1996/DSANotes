import java.util.*;
public class IsPalindromePractice{
	public static void main(String []args){
		String s="aba";
		boolean res=isPal(s);
		if(res==true){
			System.out.println("The given string is palindrome : "+s);
		}
		else{
		System.out.println("The given string is not palindrome : "+s);
		}
	}
	static boolean isPal(String s){
		 s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
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