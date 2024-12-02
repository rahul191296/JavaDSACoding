package linked.list;

public class PalindromList {

	// traverse list and store element in array or string then check
	// reverse the list and compare elements of both the list using traverse
	// above approach will take extra space
	
	
	public static LinkedList insert(LinkedList list, int val) {
		Node newNode = new Node(val); 
		if(list.head == null)
			list.head = newNode;
		
		else {
			Node temp = list.head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
			
		return list;
	}
	public static int count(LinkedList list) {
		int count =0;
		Node temp = list.head;
		
		while(temp!= null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static LinkedList reverseDirection(LinkedList list2) {
		// 1 2 3 4       2 1 3 4 
		Node prev = null, curr = list2.head, next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		
		list2.head = prev;
		
		return list2;
	}
    
	
	public static boolean isPalin(LinkedList list) {	
	boolean isPalin = true;
	Node slow = list.head, fast = list.head;
	// 1 2 3 2 0
	while(fast.next!= null && fast.next.next != null) {
		slow = slow.next;
		fast=fast.next.next;
	}
	
	LinkedList list2 = new LinkedList();
	
	list2.head= slow.next;
	
	list2 = reverseDirection(list2);     // reverse second half
	
	slow.next= null;
	
	// compare both list 
	Node temp1 = list.head;
	Node temp2 = list2.head;
	while(temp1 != null && temp2 !=null) {
		if(temp1.val != temp2.val) {
			isPalin = false;
			break;
		}
		temp1 = temp1.next;
		temp2 = temp2.next;
		
	}
	
	// make list as it is     again reverse second half and attach it to first half of original list
	list2 = reverseDirection(list2); 
	slow.next = list2.head;
	
	return isPalin;
}
	
    
    public static void main(String []args) {
		
		LinkedList list = new LinkedList();
		insert(list,1);
	     insert(list,2);
		insert(list,3);
		insert(list,2);
		insert(list,0);
		
		System.out.println(isPalin(list));
		
		 Node temp = list.head;
		while(temp!= null) {
			System.out.println(temp.val);
			temp = temp.next;
			
		} 
		
		
		
	}
}
