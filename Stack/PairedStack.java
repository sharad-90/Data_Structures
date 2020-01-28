package com.stack;

import java.util.Scanner;
import java.math.*;
import java.util.Stack;

public class PairedStack {
	static Stack<Integer> st = new Stack<Integer>();
	static Stack<Integer> tmp = new Stack<Integer>();

	public static boolean isPaired(Stack<Integer> st) {
		boolean isPair = true;
		while (!st.isEmpty()) {
			tmp.push(st.pop());
		}
		while (!tmp.isEmpty()) {
			int x = 0, y = 0;
			if (tmp.peek() != null) {
				x = tmp.pop();
			}
			if (!tmp.isEmpty()) {
				y = tmp.pop();
			} else {
				isPair = false;
				break;
			}
			if (Math.abs(x - y) != 1) {
				isPair = false;
				break;
			}
		}
		return isPair;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			int val = sc.nextInt();
			st.push(val);
		}
		System.out.println(isPaired(st));
		sc.close();
	}
}

/* add another stack and pop&push element to new stack complexity O(n) */
