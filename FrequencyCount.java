import java.util.*;
public class FrequencyCount{
	public static void main(String []args){
		String s="Hi welcome to test Automation";
		frequencyCount(s);
	}
	static void frequencyCount(String s){
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch:s.toCharArray()){
			if(ch!=' '){
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
			
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()){
			
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
	}
}