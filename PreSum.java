public class PreSum{
	public static void main(String[] args){
		int res=arr[0];
		int ps[] = new int[n];
		for(int i=1;i<l;i++){
			ps=arr[i-1]+arr[i];
		}
		System.out.println(ps);
	}
}