package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class SampleEditor {
	public static void main(String[] args) {
		Stack st = new Stack();
		String str = "";
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			int option = sc.nextInt();
			switch (option) {
			case 1:
				st.push(str);
				String name = sc.next();
				str = str + name;
				break;
			case 2:
				st.push(str);
				int pos = sc.nextInt();
				str = str.substring(0, (str.length() - pos));
				break;
			case 3:
				int index = sc.nextInt();
				System.out.println(str.charAt(index - 1));
				break;
			case 4:
				str = (String) st.pop();
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
		sc.close();
	}
}