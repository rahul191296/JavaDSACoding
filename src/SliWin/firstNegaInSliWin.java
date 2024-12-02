package SliWin;
import java.util.*;
public class firstNegaInSliWin {

	public static void main(String [] args) {
		int []arr = {-500,-400,9300,-10,0,6,10,200,500,700};
		int winSize = 3;
		int n  = arr.length;
		
		Queue<Integer> que = new ArrayDeque<Integer>();
		int l =0, r=0;
		
		while(r <n) {
			if(arr[r] < 0)
				que.add(arr[r]);
			
			if(r-l+1 < winSize)
				r++;
			
			else if(r-l+1 == winSize) {
				if(!que.isEmpty()) {
					System.out.println("negative element in window "+ l + " , " + r + " , "+que.peek());
			          que.remove();
			          
				}
				else
					System.out.println("No negative element in window " + l + " , " + r);
				
			    l++;
			    r++;
			}
		}
		
	}
	}

