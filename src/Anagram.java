import java.util.*;
public class Anagram {
	
	 static Map<Character, Integer> charCount(String s) {
		 
		 HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		      
		 char []ca = s.toCharArray(); 
		      
		 for(int i =0; i < ca.length; i++) {
		          char c = ca[i];
		          Integer countChar = map.get(c);
		          
		          if(map.get(c) == null)
		          map.put(c,1);
		          else 
		          map.put(c,++countChar);
		                  
		      }
		       
		      return map;
		     }
	 
	 public static void main(String []args) {
		 String s1 = "geeks";
		 String s2 = "eeksg";
		 
		Map<Character, Integer> map1 = charCount(s1);
		Map<Character, Integer> map2 = charCount(s2);
				 
		boolean isAnagram = map1.entrySet().stream().allMatch(e -> e.getValue().equals(map2.get(e.getKey())));
				
		System.out.println(isAnagram);
	 }

}
