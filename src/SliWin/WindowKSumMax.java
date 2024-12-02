package SliWin;

public class WindowKSumMax {

	public static void main(String []args) {
		
		int []arr = {-500,-400,9300,-10,0,6,10,200,500,700};
		int winSize = 3;
		int n  = arr.length;
		
		int sum = 0;
		int maxSum = arr[0];
		int l =0, r=0;
		
		while(r <n) {
			sum = sum + arr[r];
			// maxSum = Math.max(sum, maxSum);
			
			if(r-l+1 < winSize)
				r++;
			
			else if(r-l+1 == winSize) {
				maxSum = Math.max(sum, maxSum);	
				sum = sum - arr[l];
				
			    l++;
			    r++;
			}
		}
		System.out.println(maxSum);
	}
}
