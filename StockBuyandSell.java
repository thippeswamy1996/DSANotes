public class StockBuyandSell{
	public static void main(String[] args){
		int[] prices={1,2,3,4,5,6,9,8,7};
		int res=maxprofit(prices);
		System.out.println(res);
	}
	static int maxprofit(int prices[]){
		int minSoFOr=prices[0];
		int res=0;
		for(int i=1;i<prices.length;i++){
			minSoFOr=Math.min(minSoFOr,prices[i]);
			int profit=prices[i]-minSoFOr;
			res=Math.max(res,profit);
		}
		return res;
	}
}