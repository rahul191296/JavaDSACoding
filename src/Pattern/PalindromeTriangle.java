package Pattern;

public class PalindromeTriangle {
public static void main(String[]args) {
		
		int n =6;
		
		for(int i=1;i<=n;i++) {
			
			// 1st half
			
			// handle space 
			for(int j=1; j<= n-i ; j++) {
				
				System.out.print(" ");
			}
			// handle number
              for(int k = i; k>0 ; k--) {
				
				System.out.print(k);
			}
              
			
              //  2 nd half
              for(int s = 2; s <=i ; s++) {
            	  System.out.print(s);
      		}
              
			System.out.print("\n");
		}
		
		
	}
}
