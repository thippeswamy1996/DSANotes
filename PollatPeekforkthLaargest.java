import java.util.*;
public class PollatPeekforkthLaargest{
	public static void main(String[]args){
		int arr[]={0,1,2,3};
		int k=1;
		int res=kthLargest(arr,k);
		System.out.println(res);
		
	}
	static int kthLargest(int arr[] , int k){
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int num:arr){
			pq.add(num);
			if(pq.size()>k){
				pq.poll();
			}
		}
		return pq.peek();
	}
}