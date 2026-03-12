import java.util.*;
public class CountWords{
	public static void main(String[]args){
		String input="Hi this is India";
		Map<Character,Integer> map =new HashMap<>();
	   
for(int i=0;i<input.length();i++){
	char ch=input.charAt(i);
	            map.put(ch, map.getOrDefault(ch, 0) + 1);

}
	for(Map.Entry<Character,Integer> x:map.entrySet()){
		System.out.println("Keys "+x.getKey()+"   " +x.getValue());
	}	
}	   
	}

