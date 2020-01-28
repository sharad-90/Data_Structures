package learnbay.com.stack;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {
	static Stack<Integer> st = new Stack<Integer>();
	static Stack<Integer> tmp = new Stack<Integer>();

	public static void SortStack() {
		while (!st.isEmpty()) {
			int top = st.pop();
			if (tmp.isEmpty() || top >= tmp.peek()) {
				tmp.push(top);
			} else {
				System.out.println("size after " + top + " ===" + st.size());
				while (!tmp.isEmpty() && tmp.peek() > top) {
					st.push(tmp.pop());
				}
				tmp.push(top);
			}
		}
		while (!tmp.isEmpty()) {
			st.push(tmp.pop());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			st.push(sc.nextInt());
		}
		SortStack();
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
}
