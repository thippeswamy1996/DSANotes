public class StringSplit{
public static void main(String [] args){
String s="Hey how r u";
String[] words=s.split(" ");
StringBuilder reve= new StringBuilder();
for(String word:words){
	StringBuilder sb= new StringBuilder(word);
	reve.append(sb.reverse()).append(" ");
}
System.out.println(reve.toString().trim());
}
}