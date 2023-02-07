package impl;

public class DoubleSidedNode {

	private int value;
	private DoubleSidedNode previous;
	private DoubleSidedNode next;

	public DoubleSidedNode(int value, DoubleSidedNode previous, DoubleSidedNode next) {
		super();
		this.value = value;
		this.previous = previous;
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DoubleSidedNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoubleSidedNode previous) {
		this.previous = previous;
	}

	public DoubleSidedNode getNext() {
		return next;
	}

	public void setNext(DoubleSidedNode next) {
		this.next = next;
	}

}
