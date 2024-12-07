package ibm;
import java.util.*;
import java.util.Arrays;

public class ParseTwoJsonThenDiffInKey {
	public static List<String> getDiffSortedKey(String s1, String s2){
	    List<String> diffKeys = new ArrayList<String>();
	    
	    Map<String,String> map1 = parseJson(s1);
	    Map<String,String> map2 = parseJson(s2);
	    
	    Set<String> smallKeySet = (map1.size()<map2.size()) ? map1.keySet() : map2.keySet();
	    
	     for(String key: smallKeySet) {
	     if(map1.containsKey(key) && map2.containsKey(key)){
	         if(!map1.get(key).equals(map2.get(key))) {
	             diffKeys.add(key);
	         }
	     }
	     }
	     Collections.sort(diffKeys);
	     return diffKeys;
	}

	 public static Map<String,String> parseJson(String s){
	     Map<String,String> map = new HashMap<String,String>();
	     String keyValueString = s.replaceAll("[{}\"]" , "");   // Replace if {   or   }    or "
	     
	     String[] keyValuePair = keyValueString.split(",");     // Array of key : value
	     
	     for(int i=0;i<keyValuePair.length;i++){
	      String[] str = keyValuePair[i].split(":");  // Array of key in 0th and value in 1st index
	      map.put(str[0].trim(), str[1].trim());
	     }
	     
	     return map;
	 }

	public static void main(String [] args) {
		String str = "Ram Earned $100 on jan 20,2024";
		String numString = str.replaceAll("[^\\d]+" , " ").trim();     // 100 20 2024
		System.out.println(numString);
		//-------------------------------------------
		String json1 = "{ name : Rahul, input : Right, place : Pilua, Age : 25 }"; 
		String json2 = "{ name : kumar, input : correct , place: Pilua}";
		List<String> diffSortedKeys = getDiffSortedKey(json1, json2);              // input name
		for(String key: diffSortedKeys) 
		 System.out.println(key);

	}
}
