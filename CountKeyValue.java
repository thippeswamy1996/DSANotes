import java.util.*;
public class CountKeyValue{
	public static void main(String []args){
		String s="hi sateesh";
		count(s);
		
	}
	static void count(String s){
		Map<Character,Integer> map = new HashMap<>();
		for(char ch:s.toCharArray()){
			if(ch!=' '){
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" ="+entry.getValue());
		}
	}
}