public class VowelsCount{
public static void main(String[] args){
 String str="hello";
 int count=0;
 for(char c:str.toLowerCase().toCharArray()){
 if("aeiou".indexOf(c)!=-1){
	 System.out.println(c);
 count++;
 }
 
 }
 System.out.println(count);
 removeWovels(str);
 }
 public static void removeWovels(String str){
String result=str.replaceAll("(?i)[aeiou]","");
 System.out.println(result);
 }
 }
 //TouchAction api ......
 