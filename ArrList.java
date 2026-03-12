import java.util.*;
public class ArrList{
	public static void main(String[] args){
		List<String> list= new ArrayList<>(Arrays.asList("abc","bcd","efg"));
		Collections.reverse(list);
		System.out.println(list);
	}
}