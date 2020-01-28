package com.stack;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {
	Queue<String> q1 = new LinkedList<>();
	Queue<String> q2 = new LinkedList<>();

	public static void main(String[] args) {
		StackUsingQueue st = new StackUsingQueue();
		st.push("A");
		st.push("B");
		st.push("C");
		st.pop();
		st.pop();
		st.pop();
		st.pop();
	}

	public void push(String str) {
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		q1.add(str);
		while (!q2.isEmpty()) {
			q1.add(q2.remove());
		}
	}

	public void pop() {
		if (!q1.isEmpty()) {
			System.out.println(q1.remove());
		}else {
			System.out.println("Stakc in Empty");
		}
		
	}
}
