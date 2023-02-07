package main;

import java.util.ArrayList;
import java.util.List;

public class StackImpl {

	private List<Integer> stackList = new ArrayList<>();
	private int stackSize = 0;

	public StackImpl() {
	}

	// push
	public void pushElement(Integer value) {
		stackList.add(value);
		stackSize += 1;
	}

	// pop
	public void popElement() {
		if (stackList.isEmpty())
			System.out.println("STACK IS EMPTY!");
		else {
			stackList.remove(stackSize - 1);
			stackSize -= 1;
		}

	}

	public Integer getTop() {
		if (stackList.isEmpty())
			return null;
		else
			return stackList.get(stackSize - 1);
	}

	public Boolean isEmpty() {
		if (stackList.isEmpty())
			return true;
		else
			return false;
	}

}
