package SliWinTwoPointer;

import java.util.Arrays;

public class TriplatesSumTwoPointer {

	static boolean find3Numbers(int[] arr, int sum)
    {
		boolean flag = false;
		// 1, 4, 45, 6, 10, 8
		// 1 4 6 8 10 45                sum = 22
		Arrays.sort(arr);
		int currSum = 0;
		for(int i = 0; i<arr.length-2; i++)  {
			int l = i+1;
			int r = arr.length-1;
			
			//currSum = arr[i]+arr[l]+arr[r];
			
			while(l < r) {
				currSum  = arr[i]+arr[l]+arr[r];
				
				if(currSum == sum) {
					System.out.print(arr[i]+" , "+ arr[l]+ " , "+arr[r]+ " = " + currSum);
					flag = true;
					return flag;
					} 
				
			     else if( currSum > sum ) 
					r--;
				
			     else
					l++;					
			}
			
		}
		return flag;
    }
	public static void main(String[] args)
    {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;

       System.out.print(find3Numbers(arr, sum));
    }
}
