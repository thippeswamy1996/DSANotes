import java.util.*;
public class Rev{
	public static void main(String [] args){
		String s="Hi welcome to Automation";
		StringBuilder sb = new StringBuilder();
		String [] words=s.trim().split("\\s+");
		for(int i=words.length-1;i>=0;i--){
			
			sb.append(words[i]);
			if (i != 0) {   // add space between words
                sb.append(" ");
            }
		}
		System.out.println(sb.toString());
	}
}