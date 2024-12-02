import java.util.*;
public class LongestCommonSubstringWithoutRepition {
	
	public static String longestSubstringWithoutRepChar(String str) {
	//String s = "fabcdabef";
		
	 HashSet<Character> set = new HashSet();
	/* String longestTillNow = "";
	
	String longestOverAll = ""; 
	for (int k = 0 ; k< s.length();k++) {
	for(int i = k ; i < s.length() ; i++) {
    
	if(hs.contains(s.charAt(i))){
	   longestTillNow = "";
	    hs.clear();
	}

	   hs.add(s.charAt(i));
	   longestTillNow = longestTillNow + s.charAt(i);

	    if(longestTillNow.length() > longestOverAll.length()) {
	       longestOverAll = longestTillNow;

	}

	}
	longestTillNow = "";
    hs.clear();
}
	return longestOverAll;
	
	*/
		int p1 = 0;
		int p2 = 0;
		int r=0,l=0;
		String longest = "";
		String maxStr = "";
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	
		
while(r <str.length()) {
			
			while(set.contains(str.charAt(r))) {
				
				if(str.charAt(l) == str.charAt(r))
					set.remove(str.charAt(l));
				
				l++;
			}
			set.add(str.charAt(r));
			
			maxStr = str.substring(l,r+1);
			r++;
			if(longest.length() < maxStr.length())
				longest = maxStr;
			
		}
		return longest;
		}
		
	
	
	public static void main(String[] args) {
		//String s = "fabcdabef";   // fabcd
		
		String s = "GEEKSFORGEEKS"; //EKSFORG
		String result = longestSubstringWithoutRepChar(s);
		System.out.println(result);
	}
	
}
