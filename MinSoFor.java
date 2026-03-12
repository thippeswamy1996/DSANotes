public class MinSoFor{
	public static void main(String[] args){
		int prices[]={2,3,4,5,1,9};
		int res=profit(prices);
		System.out.println(res);
		String str="ABAcd";
		boolean ress=isPalindrome(str);
		if(ress==true){
			System.out.println("The given string is palindrome");
		}
		else{
		System.out.println("The given string is not  palindrome");
		}
	}
	static int profit(int prices[]){
		int minsoFor=prices[0];
		int res=0;
		for(int i=1;i<prices.length;i++){
			minsoFor=Math.min(prices[i],minsoFor);
			int profit=prices[i]-minsoFor;
			res=Math.max(profit,res);
		}
		return res;
	}
	static boolean isPalindrome(String str)
	{
		 int l=0,r=str.length()-1;
		 
		 while(l<r){
			 if(str.charAt(l)!=str.charAt(r))
			 {
				 return false;
			 } 
			 l++;
			 r--;
			 
		 }
		 return true;
	}
}