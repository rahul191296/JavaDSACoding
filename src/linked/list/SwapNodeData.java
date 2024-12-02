package linked.list;

public class SwapNodeData {
	
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
	
	public static LinkedList swap(LinkedList list, int k) {
		// 1 2 3 4                 1 2 3 4 5 
		int count = count(list);
		 if(count<k)
			 return list;
		 
		 Node x = list.head;
		 Node y = list.head;
		 for(int i = 1; i< k ;i++) {
			 x = x.next;
		 }
		 
		 for(int i = 1; i< count-k+1 ;i++) {
			 y = y.next;
		 }
		 
		int tempVal = x.val;
		x.val = y.val;
		y.val = tempVal; 
		
		return list;
	}
	static int count(LinkedList list) {
		int count = 0;
		Node temp = list.head;
		while (temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String []args) {
		LinkedList list = new LinkedList();
		insert(list,1);
		insert(list,2);
		//insert(list,3);
		//insert(list,4);
		//insert(list,5);
		
		swap(list, 2);        // 1 4 3 2 5 
		
		Node temp = list.head;
		while(temp!= null) {
			System.out.println(temp.val);
			temp = temp.next;
			
		}
	
	}
}
