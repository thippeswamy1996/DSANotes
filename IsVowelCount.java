public class IsVowelCount{
	public static void main(String[]args){
		String str="Reconnect Energy";
		int ans=countVowel(str);
		System.out.println(ans);
	}
	
	static boolean isVowel(char ch){
		//ch = Character.toLowerCase(ch);
		ch=Character.toLowerCase(ch);
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
	}
	static int countVowel(String str){
		int count=0;
		for(char ch:str.toCharArray()){
			if(isVowel(ch)){
				count++;
			}
		}
		return count;
	}
}