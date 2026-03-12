import java.util.*;
public class MergeStrings{
public static void main(String [] args){
String word1="abc";
String word2="pqrs";
String result= merger(word1,word2);
System.out.println(result);


}
public static String merger(String word1, String word2){
int len1=word1.length();
int len2=word2.length();
StringBuilder Merged= new StringBuilder();
int i =0;
while( i<len1 && i<len2){
  Merged.append(word1.charAt(i));
  Merged.append(word2.charAt(i));
  i++;
}
if(i<len1){
Merged.append(word1.substring(i));
}
if(i<len2){
Merged.append(word2.substring(i));
}
return Merged.toString();
}
}