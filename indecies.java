import java.util.*;
public class indecies{
	/**
	 * @param args
	 */
	public static void main(String[] args){
		String str="abbccc";
		int res=indices(str);
		System.out.println(res);
		if(res!=-1){
			System.out.println(str.charAt(res));
		}
		else{
			System.out.println("There is no reprating character exist"+res);
		}
	}
	static  int indices(String str){
		Set<Character> seen=new HashSet<>();
		for(int i=0;i<str.length();i++){
			if(seen.contains(str.charAt(i))){
				return i;
			}
			else{
				seen.add(str.charAt(i));
		}
		
		}
		return -1;
	}
}