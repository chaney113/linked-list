package linkedList;

public class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void insert(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(this.head == null) {
			this.head = new_node;
		} else {
			Node last = this.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
	}

	public void printList() {
		Node curr = this.head;
		
		System.out.print("LinkedList: ");
		while(curr != null) {
			System.out.print(curr.data + " ");
			
			curr = curr.next;
		}
		System.out.println();
	}
	
	public void deleteByKey(int key) {
		
		Node curr = this.head, prev = null;
		
		if(curr != null && curr.data == key) {
			this.head = curr.next;
			
			System.out.println(key + " found and deleted");
			
			return;
		}
		
		while(curr != null && curr.data != key) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr != null) {
			prev.next = curr.next;
			System.out.println(key + " found and deleted");
		}
		
		if(curr == null) {
			System.out.println(key + " not found");
		}
	}
	
	public void deleteAtPosition(int index) {
		
		Node curr = this.head, prev = null;
		
		if(index == 0 && curr != null) {
			this.head = curr.next;
			
			System.out.println(index + " position element deleted");
			
			return;
		}
		
		int counter = 0;
		while(curr != null) {
			if(counter == index) {
				prev.next = curr.next;
				
				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = curr;
				curr = curr.next;
				counter++;
			}
		}
		if(curr == null) {
			System.out.println(index + " position element not found");
		}
	}
}
