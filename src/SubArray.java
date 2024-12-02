import java.util.*;
public class SubArray {

	// must watch you tube vedio L1. 
	//Introduction to Sliding Window and 2 Pointers | Templates | Patterns
	// O(N+N)  
	public static int getLongestSubarray(int []a, long k) {
	        int n = a.length; // size of the array.

	        int left = 0, right = 0; // 2 pointers
	        long sum = a[0];
	        int maxLen = 0;
	        
	        
	        int i = 0;
	        int j = 0;
	        while (right < n) {
	        	
	            // if sum > k, reduce the subarray from left
	            // until sum becomes less or equal to k:
	        	
	            while (left <= right && sum > k) {
	                sum -= a[left];
	                left++;
	            }

	            // if sum = k, update the maxLen i.e. answer:
	            if (sum == k && maxLen < (right - left + 1)) {
	               maxLen = right - left + 1;
	            // store longest subarray initial and end index
	               i = left;
	               j = right;
	               
	            }

	            // Move forward the right pointer:
	            right++;
	            if (right < n)
	            	sum += a[right];
	            	
	        }
	        // print max sub array
	        for(int p = i; p<= j; p++)
            System.out.println(a[p]);
	        return maxLen;
	    }

	    public static void main(String[] args) {
	        int[] a = {2, 3, 5, 1, 9};
	        long k = 10;
	        int len = getLongestSubarray(a, k);
	        System.out.println("The length of the longest subarray is: " + len);
	    }
	}

