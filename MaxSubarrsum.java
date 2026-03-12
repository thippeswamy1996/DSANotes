public class MaxSubarrsum{
	public static void main(String[] args){
		int arr[] ={2,3,4,5,6,7};
		System.out.println(maxSubarrsum(arr));
		
	}
	static int maxSubarrsum(int[] arr ){
		int res=arr[0];
		int maxending=arr[0];
		for(int i=0;i<arr.length;i++){
		maxending=Math.max(maxending+arr[i],arr[i]);
		res=Math.max(res,maxending);
	}
	return res;
	}
}
