import java.util.*;
public class Pqtests{
	public static void main(String [] args){
		int arr[]={2,3,44,4444,444};
		int k=3;
		int res=kthlargest(arr,k);
		System.out.println(res);
	}
	static int kthlargest(int arr[],int k){
		 if (k <= 0 || k > arr.length) {
        throw new IllegalArgumentException("Invalid k");
    }
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