public class WordSplitRev{
public static void main (String[] args){
String s="Hi welcome to my class";
String[] words=s.split(" ");
 StringBuilder rev = new StringBuilder();
 for(String word:words){
 StringBuilder sb = new StringBuilder(word);
 
 rev.append(sb.reverse()).append(" ");
 }
 System.out.println(rev.toString().trim());
 }}