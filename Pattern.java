public class Pattern{
 public static void main(String [] args){
   String str="ABCDFABCD";
   String pat="ABCD";
   
   int n=str.length();
   int m=pat.length();
   for(int i=0;i<=n-m;i++){
   int j=0;
   for(j=0;j<m;j++){
   if(str.charAt(i+j)!=pat.charAt(j)){
   break;
   }
   }
   if(j==m){
   System.out.print("  " +i);
   }}
   
   }
   }