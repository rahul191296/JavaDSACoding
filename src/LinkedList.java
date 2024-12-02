import java.util.*;

class Llist {
   static Node head;
}

class Node {
    int val;
    Node next;
    
    Node(int val){
        this.val = val;
        this.next = null;
    }
}


	public class LinkedList {
	    public static Llist insert(Llist list , int val) {
	        Node newNode = new Node(val);
	        if(list.head == null)
	        list.head = newNode;
	        
	        else {
	            Node temp = list.head;
	            while(temp.next !=null ) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        return list;
	    }
	    
// ------------------------------
		
		
		

		  public static void main(String[] args) {
		       Llist list = new Llist();
		       
		       list = insert(list , 1);
		        list = insert(list , 2);
		        list = insert(list , 3);
		         list = insert(list , 4);
		         
		     
		         
		         Node temp = list.head;
			        while(temp!=null){
			            System.out.println(temp.val);
			            temp = temp.next;		         

}
		  
	}
}