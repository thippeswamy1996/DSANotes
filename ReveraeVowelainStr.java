public class ReveraeVowelainStr{
	public static void main(String [] args){
		String s = "IceCreaM";
		
		System.out.println(reverse(s));
		
	}
	
	static boolean isVowel(char c){
		c=Character.toLowerCase(c);
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}
	static void swap(char[] arr, int l,int r){
		
		char temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
	static String  reverse(String s){
		char arr[]=s.toCharArray();
		int l=0;
		int r=arr.length-1;
		while(l<r){
			if(!isVowel(arr[l])){
				l++;
			}
			else if(!isVowel(arr[r])){
				r--;
			}
			 else{
				swap(arr,l,r);
				l++;
				r--;
			}
		}
			
		return new String(arr);
	}
}