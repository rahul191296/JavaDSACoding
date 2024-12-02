import java.util.*;
import java.util.stream.Collectors;
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] a={1,2,7,8};
		
		int[] b={4,5,9};
		
		int len1 = a.length;
		
		int len2 = b.length;
		
		int []merged = new int[len1+len2+1];
		
		int pointer1 = 0;
		
		int pointer2 = 0;
		
		int i = 0;
		
		while(pointer1 < len1 && pointer2 < len2) {
			if(a[pointer1] < b[pointer2] ) {
				merged[i] = a[pointer1];
				
				pointer1 ++;
			}
			else {
				merged[i] = b[pointer2];
				pointer2++;							
		}
			i++;
		}
		 
		while(pointer1 < len1 ){
			
			merged[i] = a[pointer1];
			pointer1++;
			i++;
			
		}
		
		while(pointer2 < len2) {
			merged[i] = b[pointer2];
			i++;
			pointer2++;
			
		}
		for(int k : merged) {
			System.out.println(k);
		}
	}
}


