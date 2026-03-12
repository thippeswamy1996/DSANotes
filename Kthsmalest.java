import java.util.*;
public class Kthsmalest{
	public static void main(String[]args){
		int nums[]={1,2,3,4,5,5,8,9};
		int k=2;
		int res=kthSmalest(nums,k);
		System.out.println(res);
	}
	static int kthSmalest(int nums[],int k){
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int num:nums){
			pq.add(num);
			if(pq.size()>k){
				pq.poll();
			}
		}
		return pq.peek();
	}
}