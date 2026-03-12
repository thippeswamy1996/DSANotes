//Hello world 
//length/
//last world
public class Hello{
	public static void main(String[] args){
		String str="Helo world";
		System.out.println(str);
		System.out.println(str.length());
		int count=0;
		for(int i=str.length()-1;i>=0;i--){
			
			if(str.charAt(i)==' '){
				
				break;
				
			}
			else{
				count++;
			}
		}
		System.out.println(count);
		
	}
}