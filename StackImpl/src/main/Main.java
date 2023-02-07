package main;

public class Main {

	public static void main(String args[]) {

		StackImpl stackImpl = new StackImpl();
		stackImpl.pushElement(1);
		stackImpl.pushElement(3);
		stackImpl.pushElement(2);
		stackImpl.popElement();
		System.out.println(stackImpl.getTop());
		stackImpl.popElement();
		System.out.println(stackImpl.getTop());
		
	}

}
