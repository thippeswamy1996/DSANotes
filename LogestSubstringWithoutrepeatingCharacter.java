import java.util.*;
public class LogestSubstringWithoutrepeatingCharacter{
	public static void main(String[] args){
		String s="Thippeswamy";
		int res=lswrc(s);
		System.out.println("Logest Substring Without repeating Character is "+res);
	}
	static int lswrc(String s){
		int n=s.length();
		int maxLength=0;
		int left=0;
		Set<Character> set= new HashSet<>();
		
		for(int right=0;right<n;right++){
			while(set.contains(s.charAt(right))){
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			//set.add(s.charAt(right));
			maxLength=Math.max(maxLength,right-left+1);
		}
		return maxLength;
	}
}