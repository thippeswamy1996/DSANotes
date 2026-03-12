import java.util.*;
public class StackTest{
	public static void main(String []args){
		String s="Hi THippesj";
		String rev=rev(s);
		System.out.println(rev);
		
	}
	static String rev(String s){
		String [] words=s.split("\\s+");
		Stack<String> rev= new Stack<>();
		String res="";
		for(String word:words){
			rev.push(word);
		}
		while(!rev.isEmpty()){
			res=res+rev.pop() +" ";
		}
		
		return res;
	}
}