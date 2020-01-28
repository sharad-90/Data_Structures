package com.stack;

public class LinkedListStack {
	Node head;
	int top;

	public LinkedListStack() {
		this.head = null;
		this.top = -1;
	}

	public void push(int data) {
		Node temp = new Node(data);
		if (top == -1) {
			head = temp;
			top++;
		} else {
			temp.next = head;
			head = temp;
			top++;
		}
	}

	public int pop() {
		int element = 0;
		if (top == -1) {
			System.out.println("Empty Stack");
		} else {
			if (head.next == null) {
				element = head.data;
				top = top - 1;
			} else {
				element = head.data;
				head = head.next;
				top = top - 1;
			}
		}
		return element;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public static void main(String[] args) {
		LinkedListStack st = new LinkedListStack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		// System.out.println(st.pop());
	}
}
