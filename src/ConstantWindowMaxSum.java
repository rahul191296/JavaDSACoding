
public class ConstantWindowMaxSum {

	public static void main(String []args) {
		
		// order of n complexity
		
		int []arr = {-500,-400,-300,-10,0,6,10,200,500,700};
		
		int window = 4;
		int sum = 0;
		
		//find sum of first constant window
		for(int i = 0; i<window ; i++) {
			sum = sum +arr[i];		
		}
		int maxsum = sum;
		int l = 0;
		int r = window -1;
		
		System.out.println(maxsum);
		while( r < arr.length-1) {
			r++;
			sum = sum + arr[r];
			
			sum = sum - arr[l];
			l++;
			
			maxsum = Math.max(maxsum, sum);
			System.out.println(sum);
		}
		
		System.out.println("max sum of sub array of window 4 = " + maxsum);
	}
}
