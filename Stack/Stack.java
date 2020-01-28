package com.stack;

public class Stack {
	int top;
	int[] arr;
	int maxSize;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.arr = new int[maxSize];
	}

	public void push(int data) {
		if (!isFull()) {
			arr[++top] = data;
		}
	//	System.out.println("Stack is Full");
	}

	public int pop() {
		if (!isEmpty()) {
			return arr[top--];
		}
		System.out.println("Stack is Empty");
		return Integer.MIN_VALUE;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == (maxSize - 1));
	}

}
