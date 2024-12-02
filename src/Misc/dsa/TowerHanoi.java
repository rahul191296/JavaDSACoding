package Misc.dsa;

public class TowerHanoi {

	public static void towerOfHanoi(int n, char A,
            char B, char C)
{
         if (n == 0) {
                return;
             }
            towerOfHanoi(n - 1, A, C, B);
                System.out.println("Move disk " + n + " from rod "
                                                  + A + " to rod " + C);
            towerOfHanoi(n - 1, B, A, C);
}

	 public static void main(String args[])
	    {
	        int N = 3;

	        // A, B and C are names of rods a to c using b
	        towerOfHanoi(N, 'A', 'B', 'C');
	    }
}
