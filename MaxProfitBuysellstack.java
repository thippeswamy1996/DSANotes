public class MaxProfitBuysellstack{
	public static void main(String[] args){
		int prices[]={2,3,0,55,1,24,4};
		int res=multipleTransactions(prices);
		System.out.println(res);
	}
	static int multipleTransactions(int prices[]){
		int res=0;
		int n=prices.length;
		for(int i=1;i<n;i++){
			if(prices[i]>prices[i-1]){
				res+=prices[i]-prices[i-1];
			}
		}
		return res;
	}
}