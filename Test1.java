class Demo{
  int addition(int a ,int b){
 int c;
 c=a+b;
  
 return c;
}
}
  class Test1{
	 public static void main(String []args){
		 int a=10;
		 int b=20;
		Demo d= new Demo();
		 int res=d.addition(a,b);
		 System.out.println(res);
	 }
 }
