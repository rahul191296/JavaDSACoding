package ibm;

public class hcf {

	public static void main(String []args) {
		int m = 72, n = 27;
		
		while(m!=n) {
			
			if(m>n) {
				m = m-n;
			}
			
			else
				n=n-m;
		}
		
		System.out.print(m);
	}
}
