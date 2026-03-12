public class EvenWords{
public static void main(String[] args){
String s="Welcome to my chanel";
 evenLength(s);
 }
 public static void   evenLength(String s){
   for(String w:s.split(" ")){
     if(w.length()%2==0){
	 System.out.println(w);
	 }
	 }
	 }
	 }