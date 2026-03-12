import java.util.*;
public class LS{
	public static void main(String []args){
		String s="hello thippesh";
		int res=ls(s);
		System.out.println(res);
	}
	static int ls(String s){
	 Set<Character> set = new HashSet<>();
     int l=0;
	 int maxLen=0;
	 for(int right=0;right<s.length()-1;right++){
		 while(set.contains(s.charAt(right))){
			 set.remove(s.charAt(l));
			 l++;
		 }
		 set.add(s.charAt(right));
		 maxLen=Math.max(maxLen,right-l+1);
	 }
	 return maxLen;
	}
	
}