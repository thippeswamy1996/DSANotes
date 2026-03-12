import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int nums[] = {9, 8, 7, 6, 4};
		//o/p[7, 6, 4, 9, 8]
		int d=2;
		rotate(nums,d,nums.length);
		 System.out.println(Arrays.toString(nums));
       
		 
	   
       // System.out.println(Arrays.toString(res));
    }
	static void rotate(int[] nums,int d,int n){
		
		d%=n;
		reverse(nums,0,d-1);
	   reverse(nums,d,n-1);
	     reverse(nums,0,n-1);
		 return;
	}

    static void reverse(int[] nums ,int start,int end) {
       
        
		
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return ;
    }
}
