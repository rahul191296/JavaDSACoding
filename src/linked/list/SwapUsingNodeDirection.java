package linked.list;


public class SwapUsingNodeDirection {

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
		int count = count(list);
		
		Node x = list.head, xPrev = null , y = list.head , yPrev = null;
		
		if(count < k || k == count-k+1)         // corner case list 1 2 and k = 3
			                               // list = 1 2 3 4 5 and k = 3
			return list;     
		
		 for(int i = 1; i< k ;i++) {                 // find kth and its prev from start
			 xPrev = x;
			 x = x.next;
		 }
		 
		 for(int i = 1; i< count-k+1 ;i++) {     // find kth and its prev from last
			 yPrev = y;
			 y = y.next;
		 }
		 
		 if(xPrev != null)
			 xPrev.next = y;              // x prev point to end
			 
			 if(yPrev != null)     
				 yPrev.next = x;                 //y prev point to x
			 
			 Node temp = x.next;    // swap link of x.next and y.next
			 x.next = y.next;
			 y.next = temp;
			 
			 if(k ==1) {                  // 1 2 3 4 and k = 1 return end/y
				 list.head = y;
				 return list;				 
			 }
		
			 
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
	
	public static void main(String [] args) {
		
		LinkedList list = new LinkedList();
		insert(list,1);
		insert(list,2);
		insert(list,3);
		insert(list,4);
		
		swap(list , 1);
		
		Node temp = list.head;
		while(temp!= null) {
			System.out.println(temp.val);
			temp = temp.next;
			
		}
	}
}
