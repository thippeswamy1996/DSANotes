public class MaxProduct{
	public static void main(String [] args){
		int arr[]={1,2,-3,-4,-3,4,5,66,66,66,77};
		long  Maxpro=arr[0];
		long mul=1;
		for(int i=0;i<arr.length;i++){
			  mul=1;
			for(int j=i;j<arr.length;j++){
				mul*=arr[j];
				Maxpro=Math.max(Maxpro,mul);
			}
			
		}
		
		System.out.println(Maxpro);
	}
}