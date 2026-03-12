import java.util.Map;
import java.util.HashMap;

public class CountOccurance {
    public static void main(String[] args) {
        Map<Character, Integer> countMap = new HashMap<>();
        String str = "Helloworld";

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);

        }
        for(Map.Entry<Character,Integer> entry:countMap.entrySet()) {
            System.out.println("'"+ entry.getKey()+" appears "+entry.getValue() + " times");
    
            }
       
       
    }
}