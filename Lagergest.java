public class Lagergest{
	public static void main(String[] args){
		int arr[] ={1,2,3};
		int largest=0;
		for(int i=0;i<arr.length;i++){
			if(arr[largest]<arr[i]){
				largest=i;
				
			}
		}
		System.out.println(arr[largest]);
	}
}