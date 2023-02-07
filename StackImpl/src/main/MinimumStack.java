package main;

public class MinimumStack {

	private StackImpl stackImpl = new StackImpl();
	private StackImpl smallestValueStackImpl = new StackImpl();

	public void push(int value) {

		stackImpl.pushElement(value);
		Integer previousSmallestValue = null;
		if (!smallestValueStackImpl.isEmpty()) {
			previousSmallestValue = smallestValueStackImpl.getTop();
		}

		if (smallestValueStackImpl.isEmpty()) {
			smallestValueStackImpl.pushElement(value);
		} else if (value >= previousSmallestValue) {
			smallestValueStackImpl.pushElement(previousSmallestValue);
		} else {
			smallestValueStackImpl.pushElement(value);
		}
	}

	public void pop() {
		stackImpl.popElement();
		smallestValueStackImpl.popElement();
	}

	public int getSmallestValueInStack() {
		return smallestValueStackImpl.getTop();
	}

}
