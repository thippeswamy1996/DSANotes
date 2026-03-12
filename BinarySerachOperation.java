public class BinarySerachOperation{
	public static void main(String[] args){
		int arr[]={2,3,4,5};
		int a=5;
		int res= binarySerach(arr,a);
		System.out.println(res);
	}
	static int binarySerach(int arr[] ,int a){
		int n=arr.length;
		int l=0, r=n-1;
		while(l<=r){
			int mid = l+(r-l)/2;
			if(arr[mid]==a){
				return mid;
			}
			else if(arr[mid]<a){
				l=mid+1;
			}
			else{
				r=mid-1;
			}
			
		}
		return -1;
	} 
}