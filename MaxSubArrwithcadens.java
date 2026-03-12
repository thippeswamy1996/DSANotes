public class MaxSubArrwithcadens{
	public static void main(String[] args){
	  int arr[] ={5, 4, 1, 7, 8};
int res=maxSum(arr);
System.out.println(res);	  
	}
	static int maxSum(int arr[]){
		int res=arr[0];
		int maxEnding=arr[0];
	for(int i=1;i<arr.length;i++){
		maxEnding=Math.max(maxEnding+arr[i],arr[i]);
		res=Math.max(maxEnding,res);
	}
	return res;
	}
}