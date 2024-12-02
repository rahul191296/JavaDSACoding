import java.util.*;


public class StreamCodingQues {
	
	static Set<List<Integer>> distinctPairs(int[] arr, int target) {
        Set<List<Integer>> res = new LinkedHashSet<>();
        
          // Initialize pointers
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
          
            // Avoiding duplicates   if want to use list instead of set
        	
       /*     if (l > 0 && arr[l] == arr[l + 1]) {
                l++;
                continue;
            }

            if (r < arr.length - 1 && arr[r] == arr[r - 1]) {
                r--;
                continue;
            }
            
            */

            // Check if sum equals the target
            if (arr[l] + arr[r] == target) {
                res.add(Arrays.asList(arr[l], arr[r]));
                l++;
                r--;
            } 
              else if (arr[l] + arr[r] > target) {
                r--;
            } 
              else {
                l++;
            }
        }

        return res;
    }
	public static void main(String[] args) {
        int[] arr = {-500,-400,-300,-10,-10,0,6,6,10,200,500,700};
        int target = -4;
        Arrays.sort(arr);
      
        Set<List<Integer>> res = distinctPairs(arr, target);
        for (List<Integer> pair : res) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }
}
