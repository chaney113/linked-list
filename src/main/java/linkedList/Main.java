package linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.printList();
		
		list.deleteByKey(1);
		list.printList();
		
		list.deleteByKey(10);
		list.printList();
		
		list.deleteAtPosition(0);
		list.printList();
		
		list.deleteAtPosition(2);
		list.printList();
		
		list.deleteAtPosition(10);
		list.printList();
	}

}
