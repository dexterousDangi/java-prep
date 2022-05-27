package com.trisect.homework.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		Node nub = new Node();
		Node node = new Node(10);
		Node node1 = new Node(12);
		Node node2 = new Node(11);
		Node node3 = new Node(14);
		Node node4 = new Node(15);
		nub.next = node;
		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		Node head = nub;
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		System.out.println(node4.data);
		list.addFront(10);
		list.addFront(412);
		list.addFront(53);
		list.size();
		list.display();

	}

}
