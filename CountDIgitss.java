import java.util.*;
public class CountDIgitss{
public static void main(String[] args){
      Scanner sc =new  Scanner(System.in);
        System.out.println("Please enter input");
           int n=sc.nextInt();
 
          int res=count(n);
          System.out.println(res);
         }
    static int count(int n){
	  n=Math.abs(n);
     if(n==0){
	  return 1;
  }
  return (int)Math.floor(Math.log10(n))+1;
  }
  }