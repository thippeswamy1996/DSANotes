import java.util.*;
public class ana{
public static void main(String [] args){
  String str1="listen";
  String str2="nedsil";
  boolean res= anagram(str1, str2);
  if(res==true){
  System.out.println("The given str is anagram");
  }
  else{
  System.out.println("Its not");}
}


public static boolean anagram(String str1, String str2){
if(str1.length()!=str2.length()){
return false;}
   char [] a1 = str1.toCharArray();
   char [] a2 = str2.toCharArray();
   
   Arrays.sort(a1);
   Arrays.sort(a2);
   return Arrays.equals(a1,a2);
   
   
  }}