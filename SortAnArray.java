public class SortAnArray{
	public static void main(String[] args){
		
		int arr[]={1,3,4,5,2,9,7,8};
		bubbleSort(arr);
		for(int num:arr){
		System.out.print(" "+num);
		}
	}
	static  void   swap(int arr[],int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	static void bubbleSort(int arr[]){
		int n=arr.length;
		boolean flag;
		for(int i=0;i<n-1;i++){
			flag=false;
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					flag=true;
				}
			}
			if(!flag){
				break;
			}
		}
	}
}