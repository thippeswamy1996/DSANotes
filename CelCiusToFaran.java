public class CelCiusToFaran{
public static void main (String [] args){
   int C=100;
   double res = celciusF(C);
   System.out.println(res);
   
    System.out.println(fToCelcous(res));
   }
   public static double celciusF(int C){
     
	   return (C*1.8)+32;
	   
	 }
	 public static double fToCelcous(Double res){
    
	   return (res-32)/1.8;
	 }
}