package buoi0;

public class MyLinkedList {

	public static class Node{
		Student value;
		Node next;
		Node(Student s){
			value = new Student(s);
		}
	}
	public static void printLinkedList(Node head) {
		System.out.println();
		if(head == null)
			System.out.println("List is empty! ");
		else {
			System.out.println("List is : ");
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.value);
				temp = temp.next;
				if( temp == null)
					System.out.println();
			}
		}
	}
	public static Node addToHead(Node headNode, Student X) {
		Node newNode = new Node(X);
		if(headNode != null) {
			newNode.next = headNode;
		}
		return newNode;
	}
	public static Node addToTail(Node headNode, Student X) {
		Node newNode = new Node(X);
		if (headNode == null)
			return newNode;
		else {
			Node lastNode = headNode;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			newNode.next = null;
			lastNode.next = newNode;
		}
		return headNode;
	}
	public static Node addToIndex(Node headNode, Student X, int index) {
		if(index == 0)
			return addToHead(headNode,X);
		else {
			Node newNode = new Node(X);
			Node curNode = headNode;
			int count = 0;
			while(curNode != null) {
				count++;
				if( count == index) {
					newNode.next = curNode.next;
					curNode.next = newNode;
					break;
				}
				curNode = curNode.next;
			}			
		}
		return headNode;
		
	}
	public static Node removeAtHead(Node headNode) {
		if( headNode != null)
			return headNode.next;
		return headNode;
	}
	public static Node removeAtTail(Node headNode) {
		Node lastNode = headNode;
		Node prevNode = null;
		while(lastNode.next != null) {
			prevNode = lastNode;
			lastNode = lastNode.next;
		}
		if(prevNode == null) // List co 1 ptu
			return null;
		else
			prevNode.next = null;
		return headNode;
	}
	public static Node removeAtIndex(Node headNode, int index) {
		if (headNode == null || index < 0) {
			return null;
		}
		else if ( index == 0)
			return removeAtHead(headNode);
		Node curNode = headNode;
		Node prevNode = null;
		int count = 0;
		boolean found = false;
		while(curNode.next != null) {
			if(count == index) {
				// Remove curNode
				found = true;
				break;
			}
			prevNode = curNode;
			curNode = curNode.next;
			count++;
		}
		// Remove curNode
		if(found) {
			if(prevNode == null) { // current Node is last Node
				return null;
			}
			else
				prevNode.next = curNode.next;
		}
		return headNode;
	}
}

