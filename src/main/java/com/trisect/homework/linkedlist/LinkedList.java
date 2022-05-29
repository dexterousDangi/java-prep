package com.trisect.homework.linkedlist;

public class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	public void addFront(int data) {
		Node node = new Node(data); // we created a node with 'data' and reference 'node'
		if (head == null) { // if linkedlist is null then, declare the newly created node as head
			head = node;
		} else {
			node.next = head; // if already node present then, declare that node head and
			head = node; // now we get a new head so update the head value
		}
	}

	public void deleteFront() {
		if (head == null) {
			System.out.println("linkedlist is already empty !!");
			return;
		} else {
			head = head.next; // just change the value of head by the next node reference
		}
	}

	public boolean findElement(int element) {
		Node current = head; // create a reference with the first element of the list
		while (current != null) {
			if (current.data == element) {
				System.out.println(current.data + " :is present in the list");
				return true;
			} else {
				current = current.next;
			}
		}
		return false;

	}

	public void display() {
		Node current = head; // select the first element of the list
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println(current); // will always display null
	}

	public void size() {
		Node current = head;
		int count = 0;
		if (current == null) {
			System.out.println("linkedlist is empty");
			return;
		}
		while (current != null) {
			count += 1;
			current = current.next;
		}
		System.out.println(count);
	}

	public void addAtLast(int data) {
		Node current = head;
		Node node = new Node(data);

		if (current != null) {
			while (current != null) {

				current = current.next;
			}
			current = node;
			System.out.println(current.data);
		} else {
			head = node;

		}
	}

}
