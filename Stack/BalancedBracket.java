package com.stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class BalancedBracket {

	static String isBalanced(String s) {
		boolean isBalanced;
		Stack st = new Stack();
		if (s == null) {
			return "NO";
		} else if ((s.length() % 2 != 0)) {
			return "NO";
		} else {
			for (int i = 0; i < s.length(); i++) {
				char inChar = s.charAt(i);
				if (inChar == '(' || inChar == '[' || inChar == '{') {
					st.push(inChar);
				} else {
					if (!st.isEmpty()) {
						isBalanced = isCompare(inChar, (char) st.pop());
						if (!isBalanced) {
							return "NO";
						}
					}
				}
			}
		}
		if (!st.isEmpty()) {
			return "NO";
		} else {
			return "YES";
		}

	}

	public static boolean isCompare(char inChar, char popChar) {
		if (inChar == ')' & popChar == '(') {
			return true;
		}
		if (inChar == '}' & popChar == '{') {
			return true;
		}
		if (inChar == ']' & popChar == '[') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int count = 0;
		try {

			File f = new File("C:\\Users\\chandra\\Desktop\\1.txt");

			BufferedReader b = new BufferedReader(new FileReader(f));

			String readLine = "";

			System.out.println("Reading file using Buffered Reader");

			while ((readLine = b.readLine()) != null) {
				count++;
				if (count == 312) {
					System.out.println(readLine);
					System.out.println("s " + isBalanced(readLine));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
