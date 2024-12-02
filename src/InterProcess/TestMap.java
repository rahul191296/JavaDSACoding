package InterProcess;
import java.io.*; 
import java.util.*; 
  
class Alo {    
   
    
} 
  
// Driver code 
public class TestMap 
{ 
	 public static void main(String[] args) {
	        Map<Alo, Integer> map = new LinkedHashMap<>();
	 
	        Alo a1 = new Alo();
	        Alo a2 = new Alo();
	        Alo a3 = a2;
	 
	        map.put(a1, 1);
	        map.put(a2, 2);
	        map.put(a3, 3);
	        map.put(new Alo(), 4);
	 
	        System.out.println(map.get(a1)); // 1
	        System.out.println(map.get(a2));  // 3
	        System.out.println(map.get(a3)); // 3 
	        System.out.println(map.get(new Alo())); // 4
	        
	        map.keySet().forEach(e -> System.out.println(e));
	        
	        map.values().forEach(e -> System.out.println(e));
	    }

} 