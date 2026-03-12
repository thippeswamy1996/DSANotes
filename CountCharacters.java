import java.util.*;
public class CountCharacters{
	public static void main(String[] args){
		String input="Hello world";
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<input.length();i++){
			
			char ch =input.charAt(i);
			if(ch==' ') continue;
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer>x:map.entrySet()){
			if(x.getValue()>1){
			System.out.println(x.getKey()+":"+x.getValue());
		}
		}
	}
}