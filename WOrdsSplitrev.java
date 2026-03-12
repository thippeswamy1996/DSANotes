public class WOrdsSplitrev{
	public static void main(String[] args){
		String s="hi thippesh your wellcome";
		String words[]=s.split(" ");
		StringBuffer sf = new StringBuffer();
		for(int i=words.length-1;i>=0;i--){
			sf.append(words[i]).append(" ");
		}
		System.out.println(sf);
	}
}