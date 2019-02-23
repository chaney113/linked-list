package linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insertAtEnd(0);
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		list.insertAtEnd(6);
		list.insertAtEnd(7);
		list.insertAtEnd(20);
		System.out.println(list);

		list.insertAtIndex(9, 0);
		System.out.println(list);

		list.deleteByKey(1);
		System.out.println(list);

		list.insertAtEnd(21);
		System.out.println(list);

		list.deleteByKey(100);
		System.out.println(list);

		list.deleteAtIndex(0);
		System.out.println(list);

		list.deleteAtIndex(2);
		System.out.println(list);

		list.deleteAtIndex(10);
		System.out.println(list);
	}

}
