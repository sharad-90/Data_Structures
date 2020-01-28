package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class MaxElement {
	public int data;
	public int MaxElement;

	public MaxElement(int data, int maxElement) {
		this.data = data;
		this.MaxElement = maxElement;
	}

	public static void main(String[] args) {
		int maxEl = Integer.MIN_VALUE;
		Stack<MaxElement> st = new Stack<MaxElement>();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int choice = sc.nextInt();
			if (choice == 1) {
				int val = sc.nextInt();
				maxEl = Math.max(val, maxEl);
				MaxElement el = new MaxElement(val, maxEl);
				st.push(el);
			}
			if (choice == 2) {
				if (!st.isEmpty()) {
					st.pop();
					if (st.isEmpty()) {
						maxEl = Integer.MIN_VALUE;
					} else {
						maxEl = Math.max(st.peek().MaxElement, maxEl);
					}
				}
				if (st.isEmpty()) {
					maxEl = Integer.MIN_VALUE;
				}
			}
			if (choice == 3) {
				System.out.println(maxEl);
			}
		}
	}
}
