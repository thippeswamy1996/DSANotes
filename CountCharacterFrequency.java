import java.util.*;
public class CountCharacterFrequency{
	public static void main(String [] args){
		String str="Strring";
		charcterFrequency(str);
		
	}
	public static void charcterFrequency(String str){
		Map<Character,Integer> count= new HashMap<>();
		for(char ch :str.toCharArray()){
			count.put(ch,count.getOrDefault(ch,0)+1);
		}
		System.out.println(count);
		
	}
}