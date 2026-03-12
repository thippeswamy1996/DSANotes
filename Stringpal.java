public class Stringpal{
public static void main(String [] args){
String str="ABA";
String rev="";
  for(int i=str.length()-1; i>=0;i--){
	  rev+=str.charAt(i);
	  
  }
  if(str.equals(rev)){
	  System.out.println("The given string is palindrome "+str);
	  
  }
else{
	System.out.println("The given string is not a palindrome "+str);
}

 
 }}