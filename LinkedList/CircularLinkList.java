package com.sharad;

public class CircularLinkList {

	Node tail;

	public CircularLinkList() {
		// TODO Auto-generated constructor stub
		tail = null;
	}

	public void insertCircular(int data) {
		Node temp = new Node(data);
		if (tail == null) {
			tail = temp;
			tail.next = tail;
		} else {
			Node next = tail.next;
			temp.next = next;
			tail.next = temp;
		}
	}

	public void printCircularList() {
		Node currentNode = tail;
		System.out.println(">>" + currentNode.data);
//		while(null!=currentNode){
//			System.out.println(currentNode.data);
//			currentNode=currentNode.next;
//		}
//	}

	}
}
