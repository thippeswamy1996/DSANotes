public class ReverseVowels{
	public static void main(String[] args){
		String s="Hi Thippesh";
		String res=reverseVoewls(s);
		System.out.println(res);
	}
	 static boolean isVowel(char c){
		 return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	 }
	 static String reverseVoewls(String s){
		 char str[] =s.toCharArray();
		 int left=0, right=str.length-1;
		 while(left<right){
			 while(left<right &&!isVowel(str[left])){
				 left++;
			 }
			 while(left<right &&!isVowel(str[right])){
				 right--;
			 }
			 if(left<right){
				 char temp=str[left];
				 str[left]=str[right];
				 str[right]=temp;
				 left++;
				 right--;
			 }
				 
		 }
		 return new String(str);
	 }
}