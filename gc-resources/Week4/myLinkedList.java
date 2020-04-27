package Week4;

public class myLinkedList {
	
	public static Node head;

	public static void main(String[] args) {
		
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		
	//ASSIGNS HEAD
		head = a;
		printList();
		
	//ADDS NODE TO LINKED LIST
		a.setNext(b);
		printList();
		
		b.setNext(c);
		printList();
		
	//ADDS TO BEGINNING OF LIST
		Node m = new Node("M");
		m.setNext(a);
		head = m;
		printList();
		
	//ADDS TO END OF LIST
		Node z = new Node("Z");
		c.setNext(z);
		printList();
		
	//REMOVES FIRST NODE FROM BEGINNING
		head = head.getNext();
		printList();
		
	//ADDS IN THE MIDDLE
		Node x = new Node("X");
		b.setNext(x);
		x.setNext(c);
		c.setNext(z);
		printList();
	}
	
	public static void printList(){
		
		Node node = head;
		
		while(node != null) {
			System.out.print(node.getValue() + " ");
		
		//ADVANCE TO NEXT NODE 
			node = node.getNext();
		}
		System.out.println();
	}
	
}
