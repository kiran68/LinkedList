package com.bridgelabz.linkedlistDemo;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void append(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new_node;
		}
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
}

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.append(56);
		myList.append(30);
		myList.append(70);

		myList.printList(); // prints: 56->30->70->null
	}
}



















