import java.util.*;

public class KadensMaxsum{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9, 0, 100};
       
   int res=maxSum(arr);
   System.out.println(res);
	}
	static int maxSum(int arr[]){
		int n = arr.length;

        int res = arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<n;i++)
		{
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=Math.max(maxEnding,res);
		}
		return res;
	}
	   
	}
	/////
	Ladakh _EABA OA External bug fixes re-tesitng
	KSEB_DAC FAT Book executing.
	KSEB v2 test execution report -review.
	KSEB FS If any bug fixes need to re-test.