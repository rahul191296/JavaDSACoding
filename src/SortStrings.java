import java.util.*;
public class SortStrings {

	public static void main(String[] args) {
		String [] names = {"rahul" , "kumar", "ahat" , "prince"};
		
	    List<String> al = List.of("rahul" , "kumar", "ahat" , "prince");
	    // OR
	    List<String> al1 = Arrays.asList(names);
	    
	    al1.stream().map(e -> e.substring(0,1).toUpperCase() + e.substring(1).toLowerCase()).forEach(e -> System.out.println("name = "+e + " "));
	    
	//   reverse sort
	   al.stream().sorted((e1, e2) -> e2.compareTo(e1)).forEach(e -> System.out.println(e));

	   //longest string
	   
	  Optional<String> longest  = al.stream().reduce((e1,e2) -> e1.length()>e2.length()?e1:e2);
	  if(longest.isPresent())
		  System.out.println(longest.get());
		
		// OR sort using ArrayList
		/*ArrayList<String> list = new ArrayList<String>(Arrays.asList(names));
		Collections.sort(list);
		System.out.println(list);      */
		
	  String s = "Rahul";
	  s = "Kumar";                               // now s = kumar
	  System.out.println(s.substring(2));
	  System.out.println(s);
	  
	  String s1 = "Kumar";
	  System.out.println(s.equals(s1));    // true
	}

}
