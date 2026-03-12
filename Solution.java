import java.util.*;
class Solution {
    // code here
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int res=returnMethod(n);
    System.out.println(res);
     
    }
   
    static int returnMethod(int n){
        return 2*n;
    }
    
}