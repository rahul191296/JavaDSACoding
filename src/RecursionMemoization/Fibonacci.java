package RecursionMemoization;

public class Fibonacci {
	public static int fibonacciMemoization(int n, int[] memo) {
	    if (n <= 1) {
	        return n;
	    }
	    if (memo[n] != 0) {
	        return memo[n];
	    }
	    memo[n] = fibonacciMemoization(n-1, memo) + fibonacciMemoization(n-2, memo);
	    return memo[n];
	}
	
	public static void main(String []args) {
		
		int n= 1000;
		int [] arr = new int[n+1];
		System.out.println(fibonacciMemoization(n , arr));
	}
}
