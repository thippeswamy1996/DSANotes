public class Uniques{
public static void main(String[] args){
	int arr[]={0,1,2,4};
	int res=unique(arr);
	System.out.println(res);
}
static int unique(int arr[]){
	int xor1=0;
	int xor2=0;
for(int i=0;i<=arr.length;i++){
	xor1^=i;
}
for(int num:arr){
	xor2^=num;
	
}
return xor1^xor2;
}
}