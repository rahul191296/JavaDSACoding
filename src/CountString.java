import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
public class CountString {

	static int LCSuf(String s1, String s2, int m, int n) {
		
		if (m == 0 || n == 0 || s1.charAt(m - 1) != s2.charAt(n - 1)) {
            return 0;
        }
        return 1 + LCSuf(s1, s2, m - 1, n - 1);

		
	}
	
	static int maxCommStr(String s1, String s2) {
		int res = 0;
		int m = s1.length();
		int n = s2.length();
		
		for(int i = 1;i<=m; i++) {
			for(int j =1 ; j<=n ; j++) {
				
				res = Math.max(res ,LCSuf(s1, s2, i, j));
			}
		}
		return res;
		
		
	}
	public static void main(String [] args) {
	
        String s1 = "geeksforgeeks";
        String s2 = "practicewritegeekscourses";
        
        System.out.println(maxCommStr(s1, s2));

	}
}
