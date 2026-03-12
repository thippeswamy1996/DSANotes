import java.util.*;
public class SplitWrod{
public static void main(String[] args){
String str ="Hi my word";
String[] words=str.split(" ");
StringBuilder rev=new StringBuilder();
for(String word:words){
   StringBuilder sb = new StringBuilder(word);
   rev.append(sb.reverse()).append(" ");
   }
   System.out.println(rev);

}}