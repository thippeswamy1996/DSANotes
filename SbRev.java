public class SbRev{
	public static void main(String[]args){
		String s="Hello ";
		StringBuilder sb= new StringBuilder(s.strip());
		
		sb.reverse().toString();
		System.out.println(sb);
		sb.append("my code");
		
		System.out.println(sb.reverse().toString());
		
	}
}
