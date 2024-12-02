package linked.list;

public class DeleteNthFromLast {
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

	public static void delete(LinkedList list, int n) {
		int count = count(list);
		
		if(n > count)           // if nth is greater than list size 
			return;
		
		if(n == count) {               // if nth is the first node of list or only one element in list		
			list.head = list.head.next;
			return;
		}
		
		Node nPrev = list.head;
		for(int i = 1; i < count-n+1 -1; i++) {      // found nth = count-n+1, prev of nth = count-n+1-1
			nPrev = nPrev.next;
		}
		
		if(nPrev.next.next == null)         // if n = 1 means delete last so nprev pointing second last node
		nPrev.next = null;
		
		else 
			nPrev.next = nPrev.next.next;      // delete nth node
		
	}
public static void main(String []args) {
	
	LinkedList list = new LinkedList();
	insert(list,1);
     insert(list,2);
	insert(list,3);
	insert(list,4);
	
	delete(list, 4);
	
	Node temp = list.head;
	while(temp!= null) {
		System.out.println(temp.val);
		temp = temp.next;
		
	}
	
	
	
}
}
