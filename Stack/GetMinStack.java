package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class GetMinStack {
	static Stack<Integer> st = new Stack<Integer>();
	static Stack<Integer> stmin = new Stack<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int val = sc.nextInt();
			PushSt(val);
		}
		System.out.println("Min element is" + getMin());
		popmin();
		popmin();
		popmin();
		popmin();
		System.out.println("Min element is" + getMin());
	}

	public static void popmin() {
		if (st.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			if (st.peek() > stmin.peek()) {
				st.pop();
			} else {
				st.pop();
				stmin.pop();
			}
		}
	}

	public static int getMin() {
		if (stmin.isEmpty()) {
			System.out.println("Empty stack");
		}
		return stmin.peek();
	}

	public static void PushSt(int elem) {
		st.push(elem);
		if (stmin.isEmpty()) {
			stmin.push(elem);
		} else if (elem < stmin.peek()) {
			stmin.push(elem);
		}
	}
}
