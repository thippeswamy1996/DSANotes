import java.util.*;
public class Pqtest{
	public static void main(String []args){
		int arr[]={2,3,4,5,566,6,6};
		int k=1;
		int res=pq(arr,k);
		System.out.println(res);
	}
	static int pq(int arr[],int k){
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int val:arr){
			pq.add(val);
			if(pq.size()>k){
				pq.poll();
			}
		}
		return pq.peek();
	}
}