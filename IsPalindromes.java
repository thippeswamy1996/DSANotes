public class IsPalindromes{
	public static void main(String[] args){
		String s="aab";
		System.out.println(ispal(s));
		
	}
	static boolean ispal(String s){
		int i=0,j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}
