import java.util.*;
public class AnagramCheck{
	public static void main(String [] args){
		String a="abc";
		String b="abd";
		boolean res=anagram(a,b);
		if(res==true){
			System.out.println("Anagram");
		}
		else{
			System.out.println("not Anagram");
		}
	}
		static boolean anagram(String str1, String str2){
			if(str1.length()!=str2.length()){
				return false;
			}
			char [] a=str1.toCharArray();
			char [] b=str2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			return Arrays.equals(a,b);
		}
		
	}
