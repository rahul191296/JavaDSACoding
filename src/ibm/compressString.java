package ibm;

import java.util.*;

public class compressString {

	public static StringBuilder properCompression(String str) {
		Map<Character, Integer> map = new TreeMap<>();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i< str.length(); i = i+2) {
			char c = str.charAt(i);                                 // take char
			int num = Integer.parseInt(str.substring(i+1, i+2));   // take char count
			
			if(map.get(c) != null) {                     // store each char total count in map
			int total = num + map.get(c);
			map.put(c , total);
			}
			
			else
				map.put(c, num);
		}
		
		// System.out.println(map);
		// print the result
		for(char c : map.keySet()) {
			
			for(int i = 1; i <= map.get(c) ; i++) {
			result.append(c);                          // append each char to output string
			}
		}
		return result;
	}
	
	public static String properCompression2(String s) {
        StringBuilder compressedStr = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) { char c = s.charAt(i); int count = Character.getNumericValue(s.charAt(i + 1)); while (count > 0) {
                compressedStr.append(c);
                count--;
            }
        }

        return compressedStr.toString();
    }

	public static void main(String[] args) {
        String inputStr = "a3b5c2a2";
        System.out.println(properCompression(inputStr));  // Output: "aaabbbbbcc"
        
    }
}
