package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
	Queue<String> q1 = new LinkedList<>();
//	Queue<String> q2 = new LinkedList<>();

	public static void main(String[] args) {
		StackUsingOneQueue st = new StackUsingOneQueue();
		st.push("A");
		st.push("B");
		st.push("C");
		st.pop();
		st.pop();
		st.pop();
		st.pop();
	}

	public void push(String str) {
		int size = q1.size();
		q1.add(str);
		for (int i = 0; i < size; i++) {
			q1.add(q1.remove());
		}
	}

	public void pop() {
		if (!q1.isEmpty()) {
			System.out.println(q1.remove());
		} else {
			System.out.println("Stack in Empty");
		}

	}
}
