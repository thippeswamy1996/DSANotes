import java.util.*;
public class ReverseWords{
	public static void main(String[] args){
		String s="Hello Automation test";
		String words[]=s.split(" ");
		String rev="";
		for(int i=words.length-1;i>=0;i--){
			rev+=words[i]+" ";
		}
		System.out.println(rev.trim());
	}
}

BufferedReader br = new BufferedReader();