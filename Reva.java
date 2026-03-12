public class Reva{
public static void main(String [] args){
  String str="Thippu";
  String revstr="";
  int count=0;
    for(int i=str.length()-1;i>=0;i--){
	
	   revstr+=str.charAt(i);
	   count++;
	 }
	   System.out.println(revstr);
	   System.out.println(count);
	   }
	   
}