import java.util.*;
public class CountChar {

	public static void countChar(String str) {
		
		char []c = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < c.length; i++) {
			
			char ch  = c[i];
			if(!map.containsKey(ch))
				map.put(ch,1);
			
			else {
				
				int count = map.get(ch);
				map.put(ch,++count);
			}
			
		}
		
		
		Set<Character> set = map.keySet();
	 
	 for(Character ch : set) {
		 System.out.println("key = "+ ch + " value = " +map.get(ch));
	 }
	 
	 // or 
	 Set<Map.Entry<Character, Integer>> s = map.entrySet();
	 
		for(Map.Entry e : s) {
			System.out.println(e.getKey());
		}
		
	}
	
	public static void main(String [] args) {
		String str = "aaabbaabbb";
		
		countChar(str);
		
	}
}
