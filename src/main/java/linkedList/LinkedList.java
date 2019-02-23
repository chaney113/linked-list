package linkedList;

public class LinkedList {
	private int counter;
	private Node head;

	class Node {
		int data; // TODO make this more versatile?
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

		int getData() {
			return data;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node nextValue) {
			next = nextValue;
		}
	}

	private int getCounter() {
		return counter;
	}

	private void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	public int size() {
		return getCounter();
	}

	public void insertAtEnd(int data) {
		Node new_node = new Node(data);

		if (head == null) {
			head = new_node;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(new_node);
		}
		incrementCounter();
	}

	public void insertAtIndex(int data, int index) {

		System.out.println("insert " + data + " at index " + index);

		Node new_node = new Node(data);
		Node curr = head;

		if (index == 0) {
			new_node.next = head;
			head = new_node;
			return;
		}

		if (curr != null) {
			for (int i = 0; i < index && curr.getNext() != null; i++) {
				curr = curr.getNext();
			}
		}

		curr.setNext(new_node);
		incrementCounter();
	}

	public boolean deleteAtIndex(int index) {
		if (index < 0 || index > size()) {
			System.out.println("out of range index " + index);
			return false;
		}

		Node curr = head;
		if (head != null) {

			System.out.println("delete at index " + index);

			if (index == 0) {
				head = curr.getNext();
				decrementCounter();
				return true;
			} else {
				for (int i = 0; i < index - 1; i++) {
					if (curr.getNext() == null) {
						return false;
					}
					curr = curr.getNext();
				}
				curr.setNext(curr.getNext().getNext());

				decrementCounter();
				return true;
			}
		}

		System.out.println("head is null for index " + index);
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node curr = this.head;

		while (curr != null) {
			sb.append(curr.getData()).append(" ");

			curr = curr.getNext();
		}
		return sb.toString();
	}

	public void deleteByKey(int key) {
		Node curr = head, prev = null;

		if (curr != null && curr.getData() == key) {
			head = curr.getNext();

			System.out.println("deleted key " + key);

			return;
		}

		while (curr != null && curr.getData() != key) {
			prev = curr;
			curr = curr.getNext();
		}

		if (curr != null) {
			prev.next = curr.getNext();
			System.out.println("deleted key " + key);
		}

		if (curr == null) {
			System.out.println("key " + key + " not found");
		}
	}
}
