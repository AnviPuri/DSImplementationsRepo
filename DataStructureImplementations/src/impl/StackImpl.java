package impl;

public class StackImpl {

	private int[] stackArr;
	private int size;
	private static int TOP = -1;

	public StackImpl(int size) {
		this.size = size;
		stackArr = new int[size];
	}

	public void push(int num) {
		if (TOP == (size - 1)) {
			System.out.println("STACK IS FULL!");
		} else {
			TOP += 1;
			stackArr[TOP] = num;
		}
	}

	public void pop() {
		if (TOP == -1) {
			System.out.println("STACK IS EMPTY!");
		} else {
			TOP -= 1;
		}
	}
	
	public void peek() {
		if (TOP == -1) {
			System.out.println("STACK IS EMPTY!");
		} else {
			System.out.println("ELEMENT ON TOP IS " + stackArr[TOP]);
		}
	}

	public void printStack() {
		if (TOP == -1) {
			System.out.println("STACK IS EMPTY!");
		} else {
			System.out.println("PRINTING STACK!");
			for (int i = 0; i <= TOP; i++) {
				System.out.println(stackArr[i]);
			}
		}
	}

}
