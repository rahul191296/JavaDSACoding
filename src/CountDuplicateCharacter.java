import java.util.*;
import java.lang.*;
import java.util.Map.Entry;
public class CountDuplicateCharacter {
	
	public void printCountDuplicateCharacter(String str)  {
	HashMap<Character , Integer> map = new HashMap<Character , Integer>();
		
		for( int i = 0 ; i< str.length(); i++) {
			char c  = str.charAt(i);
			Integer coutChar = map.get(c);
		
			if(map.get(c) == null) {
				map.put(c, 1);
				
			}
			else {
				map.put(c, ++coutChar);
			}

			
		}
		System.out.println("To print only duplicate values");
		for(Map.Entry e : map.entrySet()) {
			
			Integer count  = (Integer)e.getValue();        // get the count and convert object to int 
			if(count > 1) {                                     // to print only duplicate values
			System.out.println(e.getKey()+ "="+ e.getValue() );
			
			}  
		
		}
		// to print frequency in descending order
		System.out.println("to print frequency of duplicates in descending order");
		Set<Entry<Character , Integer>> set = map.entrySet();
		List<Entry<Character , Integer>> list = new ArrayList<Entry<Character , Integer>>(set); 
		
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() /*imple of Comparator interface using anonymous class*/{

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());  // for descending 
				
				// for ascending return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
            for(Entry<Character , Integer> e: list) {                                   
			System.out.println(e.getKey()+ "="+ e.getValue() );
			
		}
		
	}
}
