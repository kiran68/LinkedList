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
		Node node1 = new Node(data);
		if (head == null) {
			head = node1;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node1;
		}
	}

	public void insert(int data, int afterData) {
		Node node1 = new Node(data);
		if (head == null) {
			head = node1;
		} else {
			Node current = head;
			while (current != null && current.data != afterData) {
				current = current.next;
			}
			if (current != null) {
				node1.next = current.next;
				current.next = node1;
			} else {
				System.out.println("Node with data " + afterData + " not found");
			}
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

	
public void popLast() {
    if (head == null) {
        System.out.println("Linked list is empty.");
    } else if (head.next == null) {
        // Only one element in the linked list
        head = null;
    } else {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
}
}
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.append(56);
		myList.append(70);

		myList.insert(30, 56);
		myList.popLast();
		myList.printList();
	}
}






