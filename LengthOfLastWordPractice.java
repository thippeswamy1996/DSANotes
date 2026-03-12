public class LengthOfLastWordPractice{
	public static void main(String []args){
		String s="Hello Frinds";
		int res=lengthOflastWord(s);
		System.out.println("Length of last word "+res);
	}
	static int lengthOflastWord(String s){
		int i=s.length()-1;
		int length=0;
		while(i>=0&&s.charAt(i)==' '){
			i--;
		}
		while(i>=0&&s.charAt(i)!=' '){
			length++;
			i--;
		}
		return length;
	}
}