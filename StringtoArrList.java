import java.util.*;
public class StringtoArrList{
public static void main(String[] args){
	String s="java";
	List<Character> li= new ArrayList<>();
	for(int i=0;i<s.length();i++){
		li.add(s.charAt(i));
	}
	System.out.println(li);
}
}