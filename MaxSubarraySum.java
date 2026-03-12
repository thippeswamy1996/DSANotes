public class MaxSubarraySum{
	public static void main(String[]args){
		int arr[] ={1,-1,2,3,4,5,8,9,-9,-7};
		int res=arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<arr.length;i++){
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=Math.max(res,maxEnding);
		}
		System.out.println(res);
	}
}