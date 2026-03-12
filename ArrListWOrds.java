public class ArrListWOrds{
	public static void main(String[] args){
		String s="Heloo automation testing";
		String words[]=s.split(" ");
		//String rev="";
		StringBuilder rev=new StringBuilder();
		for(int i=words.length-1;i>=0;i--){
			//rev +=words[i]+" ";
			 rev.append(words[i]).append(" ");
		}
		System.out.println(rev.toString().trim());
	}
	}