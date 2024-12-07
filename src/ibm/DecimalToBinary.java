package ibm;

import java.util.Arrays;

public class DecimalToBinary {

	public static void main(String []args) {
	int n = 10;
	int []binary = new int[10];
	int k = 0;
	for(k = 0 ; n >0 ;k++) {                 // store the bit till n >0
		binary[k] = n % 2;
		n = n /2;
		
	}
	for(int i=0; i <= k; i++ )              // print bits till k
	System.out.print(binary[i]);
	}
}
