import java.util.*;
import java.util.stream.*;
public class sort {
	public static Map<Integer,Integer> removeDuplicate( ) {
		
	List<Integer> list = List.of(1,1,2,2,3,4);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		List<Integer> st = list.stream().peek(e -> {
			
			if(!map.containsKey(e))
			map.put(e,1);	
			
			else if(map.get(e) >= 1) {
				map.remove(e);
			}
			else  {
				int count = map.get(e);
				map.put(e, ++count );
				
			}
		}).collect(Collectors.toList());
		
		return map;   
		
	}
		
		
	
	public static void main(String []args) {
		
		                   
		Map<Integer,Integer> map = removeDuplicate();
		
	for(int key : map.keySet()) {
		System.out.println("key = "+key+ ", value = " + map.get(key));
	
		}
	for(int value : map.values()) {
		System.out.println("value = "+value);
	
		}		
	
	for(Map.Entry m : map.entrySet()) 
		System.out.println(m.getValue());
	
	
    Set<Map.Entry<Integer,Integer>> set=map.entrySet();//Converting to Set so that we can traverse  
    
    Iterator itr = set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry = (Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
    
    Map<String, String> map1 = new HashMap<String, String>();

    map1.put("abc", "bcd");
    map1.put("efg", "hij");
    map1.put("klm", "nop");
    map1.put("qrs", "tu");

    Set<Map.Entry<String, String>> set1 = map1.entrySet();

    Iterator itr1 = set1.iterator();

    while(itr1.hasNext()){

    Map.Entry<String, String>  e = (Map.Entry<String, String>)itr1.next();

    System.out.println(e.getKey() + " " + e.getValue());


    }

    
  List<String> list = List.of("Rahul" , "", "",  "Kumar");
  long countStr = list.stream().filter(e -> e.isEmpty()).count();
  System.out.println("empty string = " + countStr);
		}
	}

