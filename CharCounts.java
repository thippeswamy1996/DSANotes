import java.util.*;
public class CharCounts{
   public static void main(String [] args){
	String str="A-HIGH Impact on Load Test on 30-04-2025                 Holiday  ";
	count(str);
	
}
      public static void count(String str){
	 Map<Character, Integer> count = new HashMap<>();
	
 for(char ch:str.toCharArray()){
   count.put(ch,count.getOrDefault(ch,0)+1);
}
		
		for(Map.Entry<Character, Integer> entry:count.entrySet()){
			if (entry.getValue() >1){
				System.out.println(entry.getKey() +" " +entry.getValue());
			}
		}
	}
}	

