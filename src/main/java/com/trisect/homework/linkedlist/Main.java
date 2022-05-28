package com.trisect.homework.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addFront(10);
		list.addFront(412);
		list.addFront(53);
		list.size();
		list.display();
		list.addAtLast(40);
		list.display();
		list.findElement(10);
		
		Node node = new Node(10);
		Node node1 = new Node(12);
		Node node2 = new Node(11);
		Node node3 = new Node(14);
		Node node4 = new Node(15);

		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		Node head = node;
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		System.out.println(node4.data);
	}

}
