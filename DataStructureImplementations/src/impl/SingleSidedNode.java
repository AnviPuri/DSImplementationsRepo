package impl;

public class SingleSidedNode {
	
	private int value;
	private SingleSidedNode next;
	
	public SingleSidedNode(int value, SingleSidedNode next) {
		this.value = value;
		this.next = next;
	}
	
	public void setNextNode(SingleSidedNode next) {
		this.next = next;
	}
	
	public int getNodeValue() {
		return value;
	}
	
	public SingleSidedNode getNextNode() {
		return next;
	}

}
