public class Kaden{
	public static void main(String[]args){
		int arr[]={2,3,4,5,6,7,8,9,10};
		int res=kadensSum(arr);
		
			System.out.println(res);
		
	}
	static int kadensSum(int []arr){
		int maxEnding=arr[0];
		int res=arr[0];
		for(int i=1;i<arr.length;i++){
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=Math.max(res,maxEnding);
		}
		
		return res;
	}
}