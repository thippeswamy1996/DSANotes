public class Reversetr{
	public static void main(String[] args){
		String str="Tippu";
		String rev="";
		int n=str.length();
		int count=0;
		for(int i=n-1;i>=0;i--){
			rev+=str.charAt(i);
			count++;
			
		}
		System.out.println(rev);
		System.out.println(count);
	}
}