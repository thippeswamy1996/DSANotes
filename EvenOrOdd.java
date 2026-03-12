import java.util.*;
public class EvenOrOdd{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the user input");
		int n=sc.nextInt();
		if((n&1)==0){
			System.out.println("The given number is even");
		}
		else{
			System.out.println("The given number is odd");
		}
		sc.close();
	}
}