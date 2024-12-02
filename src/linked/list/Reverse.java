package linked.list;
import java.util.*;

public class Reverse {
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
	
	public static void reverseDirection(LinkedList list) {
		// 1 2 3 4       2 1 3 4 
		Node prev = null, curr = list.head, next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		
		list.head = prev;
		
		
	}
	
	public static void reverseStack(LinkedList list) {
		Stack<Node> st = new Stack<>();
		Node temp = list.head;
		while(temp != null) {
			st.push(temp);
			temp = temp.next;
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop().val);
		}
	}
	
	public static Node reverseRecursion(Node node) {
		// 1 2 3 4     1 4 3 2 
		if(node == null || node.next == null) 
			return node;
		
		Node head = reverseRecursion(node.next);
		node.next.next = node;
		node.next = null;
		
			return head;
	}
public static void main(String []args) {
	LinkedList list = new LinkedList();
	insert(list,1);
	insert(list,2);
	insert(list,3);
	insert(list,4);
	
	//reverseDirection(list);
	
	//reverseStack(list);
	
	Node head = list.head;
	Node result = reverseRecursion(head);
	list.head = result;
	
	Node temp = list.head;
	while(temp!= null) {
		System.out.println(temp.val);
		temp = temp.next;
		
	}
	
	
	
}
}
