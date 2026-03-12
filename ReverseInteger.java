public class ReverseInteger{

public static void main(String [] args){


int n=1233;
int res=rev(n);
System.out.println(res);
  
}
  public static int rev(int n){
    int rev =0;
	while(n!=0){
	   int x =n%10;
	   n/=10;
	   if(rev>Integer.MAX_VALUE/10 ||( rev==Integer.MAX_VALUE/10 && x>7)){
	   return 0;
	   }
	   if(rev<Integer.MIN_VALUE/10 ||( rev==Integer.MIN_VALUE/10 && x<-8)){
	   return 0;
	   }
	   
	   rev =rev*10+x;
	   
	
	}
	return rev;
  
  
  }
}