public class ImprovedPattern{
public static void main(String [] args){
String str="ABCDEAERABCEABCD";
String pat="ABCD";
    int n=str.length();
	int m=pat.length();
	for(int i=0; i<=n-m;){
		
		int j;
		for(j=0;j<m;j++){
			if(str.charAt(j+i)!=pat.charAt(j)){
				break;
			}
			
			
		}
		if(j==m){
				System.out.println(i);
			}
			if(j==0){
				i++;
			}
			else{
				i=i+j;
			}
	}
  
  }}