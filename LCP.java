public class LCP{
	public static void main(String []args){
		String[] str={"Flow","Fly","Flower"};
		String res=lcp(str);
		System.out.println(res);
	}
	static String lcp(String[] str){
		if(str==null||str.length==0){
			return "";
		}
		  for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
        }
		String prefix=str[0];
		for(int i=1;i<str.length;i++){
			while(str[i].indexOf(prefix)!=0){
				prefix=prefix.substring(0,prefix.length()-1);
				
				if(prefix.isEmpty()){
					return "";
				}
			}
		}
		return prefix;
	}
}