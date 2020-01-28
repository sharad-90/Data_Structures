package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class GetMaxStack {

	static Stack<Integer> st = new Stack<Integer>();
	static Stack<Integer> stmax = new Stack<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int val = sc.nextInt();
			PushSt(val);
		}
		System.out.println("Max element is" + getMax());
		popmax();
		popmax();
		popmax();
		popmax();
		System.out.println("Max element is" + getMax());
	}

	public static void popmax() {
		if (st.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			if (st.peek() < stmax.peek()) {
				st.pop();
			} else {
				st.pop();
				stmax.pop();
			}
		}
	}

	public static int getMax() {
		if (stmax.isEmpty()) {
			System.out.println("Empty stack");
		}
		return stmax.peek();
	}

	public static void PushSt(int elem) {
		st.push(elem);
		if (stmax.isEmpty()) {
			stmax.push(elem);
		} else if (elem > stmax.peek()) {
			stmax.push(elem);
		}
	}
}
