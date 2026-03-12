import java.util.*;
public class CharactersinStr{
   public static void main(String[] args){
   String str="My Name is thippesh";
   printChar(str);
   int count=0;
   System.out.println("\n Total Characters in String: "+count);
	 }
	 public static  void printChar(String str){
		  for(int i=0;i<str.length();i++){
	System.out.print(" " +str.charAt(i));
	count++;
	 }
	 }
	
	
	}