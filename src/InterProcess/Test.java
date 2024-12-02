package InterProcess;
import java.util.*;

class A {
    String name;
	A(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		A a = (A)o;
		return this.name == a.name;
	}
	
	@Override
	public int hashCode() {		
		return this.name.hashCode();
	}
    }
 
public class Test {
    public static void main(String[] args) {
        Map<A, Integer> map = new HashMap<>();
 
        A a1 = new A("a");
        A a2 = new A("a");
      
        A a3 = a2;
 
        map.put(a1, 1);
        map.put(a2, 2);
        map.put(a3, 3);
       
        map.put(new A("c"), 4);
 
        System.out.println(map.get(a1)); // 4
        System.out.println(map.get(a2));  // 4
        System.out.println(map.get(a3)); // 4
        
        System.out.println(map.get(new A("d"))); // 4
    }
}
