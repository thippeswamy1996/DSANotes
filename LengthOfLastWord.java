class LengthOfLastWord{
	public static void main(String[] args){
		String s="Hello worl this is m ";
		int res=lengthOfLastWord(s);
		System.out.println("The length of the last word is "+res);
		
		
	}
	static int lengthOfLastWord(String s){
		int length=0;
		int i=s.length()-1;
		
		while(i>=0 &&s.charAt(i)==' '){
			i--;
		}
		while (i>=0 &&s.charAt(i)!=' '){
			length++;
			i--;
		}
		return length;
	}
}