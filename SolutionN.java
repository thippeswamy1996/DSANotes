

//User function Template for Java

public class SolutionN{
public static void main(String [] args){
	int n=99999;
	int res=sumOfDigits(n);
	System.out.println(res);
}

    // complete the function
    public static int sumOfDigits(int n)
    {
        //i add your code here
        
        if(n==0){
            return 0;
        }
        
        return (n%10)+sumOfDigits(n/10);
    }
}

