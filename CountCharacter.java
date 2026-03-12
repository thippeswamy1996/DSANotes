import java.util.HashMap;
import java.util.Map;

public class CountCharacter{
    public static void main(String[] args) {
        
        String str = "automation";
        
        // Create HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            
            // If character already exists, increment count
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } 
            // Else put 1
            else {
                map.put(ch, 1);
            }
        }
        
        // Print result
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
