import java.util.*;
public class BubbleSort {
 
	public static void main(String[] args) {
		
		 List<Integer> list1 = List.of(10,20,30);
		 
		 List<Integer> list2 = List.of(15,25,35,38,40);
		 
		 List<Integer> merged = new ArrayList<Integer>();
		 
		 int n1 = list1.size();
		 int n2 = list2.size();
		 
		 int p1=0;
		 int p2=0;
		 
		 while(p1<n1 && p2 < n2) {
			 int a = list1.get(p1);
			 int b = list2.get(p2);
			 if(a < b) {
				 merged.add(a);
				 p1++;
				 
			 }
			 
			 else {
				 merged.add(b);
				 p2++;
				 
		 }
		 
		
	}
		 // copy rest elements
		 while( p1<n1) {
			 merged.add(list1.get(p1));
			 p1++;
		 }
		 
		 while(p2<n2) {
			 merged.add(list2.get(p2));
			 p2++;
			 
		 }
		 merged.forEach(e -> System.out.println(e));
		 
}
	
}