package impl;

public class DoubleLinkedListImpl {

	private DoubleSidedNode head;
	private DoubleSidedNode tail;
	private DoubleSidedNode currentNode;

	public DoubleLinkedListImpl() {
		this.head = null;
		this.tail = null;
	}

	private void initialiseCurrentNodeFromBeginning() {
		this.currentNode = this.head;
	}

	private void initialiseCurrentNodeFromEnd() {
		this.currentNode = this.tail;
	}

	public void insertNodeAtBeginning(int value) {
		if (this.head == null) {
			DoubleSidedNode doubleSidedNode = new DoubleSidedNode(value, null, null);
			this.head = doubleSidedNode;
			this.tail = doubleSidedNode;
		} else {
			DoubleSidedNode doubleSidedNode = new DoubleSidedNode(value, null, this.head);
			this.head = doubleSidedNode;
			doubleSidedNode.getNext().setPrevious(doubleSidedNode);
		}
	}

	public void insertNodeAtEnd(int value) {
		if (this.head == null) {
			DoubleSidedNode doubleSidedNode = new DoubleSidedNode(value, null, null);
			this.head = doubleSidedNode;
			this.tail = doubleSidedNode;
		} else {
			this.initialiseCurrentNodeFromEnd();
			DoubleSidedNode doubleSidedNode = new DoubleSidedNode(value, this.tail, null);
			this.tail = doubleSidedNode;
			doubleSidedNode.getPrevious().setNext(doubleSidedNode);
		}
	}

	public void insertNodeAtNthPositionFromBeginning(int value, int position) {

		int linkedListSize = this.getLinkedListSize();
		if (linkedListSize == 0) {
			System.out.println("The Linked List is Empty!");
		} else if (position > (linkedListSize + 1)) {
			System.out.println("Cannot add value at the given position since position exceeds size.");
		} else if (position == 1) {
			this.insertNodeAtBeginning(value);
		} else if (position == (linkedListSize + 1)) {
			this.insertNodeAtEnd(value);
		} else {
			int count = 1;
			this.initialiseCurrentNodeFromBeginning();
			while (this.currentNode != null) {
				if ((count + 1) == position) {
					DoubleSidedNode doubleSidedNode = new DoubleSidedNode(value, this.currentNode,
							this.currentNode.getNext());
					this.currentNode.setNext(doubleSidedNode);
					doubleSidedNode.getNext().setPrevious(doubleSidedNode);
					break;
				}
				this.currentNode = this.currentNode.getNext();
				count += 1;
			}
		}
	}

	public void deleteNodeFromBeginning() {
		if (this.head == null) {
			System.out.println("The Linked List is Empty!");
		} else {
			this.head = this.head.getNext();
			this.head.setPrevious(null);
		}
	}

	public void deleteNodeFromEnd() {
		if (this.tail == null) {
			System.out.println("The Linked List is Empty!");
		} else {
			this.tail = this.tail.getPrevious();
			this.tail.setNext(null);
		}
	}

	public void deleteNodeFromNthPositionFromBeginning(int position) {

		int linkedListSize = this.getLinkedListSize();
		if (linkedListSize == 0) {
			System.out.println("The Linked List is Empty!");
		} else if (position > linkedListSize) {
			System.out.println("Cannot delete value at the given position since position exceeds size.");
		} else if (position == 1) {
			this.deleteNodeFromBeginning();
		} else if (position == linkedListSize) {
			this.deleteNodeFromEnd();
		} else {
			int count = 1;
			this.initialiseCurrentNodeFromBeginning();
			while (this.currentNode != null) {
				if ((count + 1) == position) {
					this.currentNode.setNext(this.currentNode.getNext().getNext());
					this.currentNode.getNext().setPrevious(this.currentNode);
					break;
				}
				this.currentNode = this.currentNode.getNext();
				count += 1;
			}
		}
	}

	public void printNodeFromBeginning() {
		if (this.head == null) {
			System.out.println("The Linked List is Empty!");
		} else {
			System.out.println("NODE VALUES :");
			this.initialiseCurrentNodeFromBeginning();
			while (this.currentNode != null) {
				System.out.println(this.currentNode.getValue());
				this.currentNode = this.currentNode.getNext();
			}
		}
		System.out.println("*******************************");
	}

	public void printNodeFromEnd() {

		if (this.tail == null) {
			System.out.println("The Linked List is Empty!");
		} else {
			System.out.println("NODE VALUES :");
			this.initialiseCurrentNodeFromEnd();
			while (this.currentNode != null) {
				System.out.println(this.currentNode.getValue());
				this.currentNode = this.currentNode.getPrevious();
			}
		}
		System.out.println("*******************************");
	}

	private int getLinkedListSize() {

		int size = 0;
		if (this.head == null) {
			return size;
		}
		this.initialiseCurrentNodeFromBeginning();
		while (this.currentNode != null) {
			size += 1;
			this.currentNode = this.currentNode.getNext();
		}
		return size;
	}

}
