package impl;

public class SingleLinkedListImpl {

	private SingleSidedNode head;
	private SingleSidedNode currentNode;
	
	public SingleLinkedListImpl() {
		this.head = null;
	}

	private void initialiseCurrentNode() {
		this.currentNode = this.head;
	}

	public void insertNodeAtEnd(int value) {

		SingleSidedNode node = new SingleSidedNode(value, null);
		if (this.head == null) {
			this.head = node;
		} else {
			this.initialiseCurrentNode();
			while (this.currentNode.getNextNode() != null) {
				this.currentNode = this.currentNode.getNextNode();
			}
			this.currentNode.setNextNode(node);
		}
	}

	public void insertNodeAtBeginning(int value) {

		SingleSidedNode node = new SingleSidedNode(value, null);
		if (this.head == null) {
			this.head = node;
		} else {
			SingleSidedNode firstNode = this.head;
			node.setNextNode(firstNode);
			this.head = node;
		}
	}

	public void insertNodeAtNthPosition(int value, int position) {

		int linkedListSize = this.getLinkedListSize();
		if (linkedListSize == 0) {
			System.out.println("The Linked List is Empty!");
		} else if (position > (linkedListSize + 1)) {
			System.out.println("Cannot add value at the given position since position exceeds size.");
		} else if (position == (linkedListSize + 1)) {
			this.insertNodeAtEnd(value);
		} else if (position == 1) {
			this.insertNodeAtBeginning(value);
		} else {
			int count = 1;
			this.initialiseCurrentNode();
			while (this.currentNode != null) {
				if ((count + 1) == position) {
					SingleSidedNode node = new SingleSidedNode(value, this.currentNode.getNextNode());
					this.currentNode.setNextNode(node);
					break;
				}
				this.currentNode = this.currentNode.getNextNode();
				count = count + 1;
			}
		}
	}

	public void deleteNodeFromBeginning() {
		if (this.head == null) {
			System.out.println("The Linked List is Empty!");
		} else {
			this.head = this.head.getNextNode();
		}
	}

	public void deleteNodeFromEnd() {
		if (this.head == null) {
			System.out.println("The Linked List is Empty!");
		} else if (this.head.getNextNode() == null) {
			this.head = null;
		} else {
			this.initialiseCurrentNode();
			while (this.currentNode.getNextNode() != null) {
				if (this.currentNode.getNextNode().getNextNode() == null) {
					this.currentNode.setNextNode(null);
					break;
				}
				this.currentNode = this.currentNode.getNextNode();
			}
		}
	}

	public void deleteFromNthPosition(int position) {

		int linkedListSize = this.getLinkedListSize();

		if (linkedListSize == 0) {
			System.out.println("The Linked List is Empty!");
		} else if (position > (linkedListSize + 1)) {
			System.out.println("Cannot delete value at the given position since position exceeds size.");
		} else if (position == (linkedListSize)) {
			this.deleteNodeFromEnd();
		} else if (position == 1) {
			this.deleteNodeFromBeginning();
		} else {
			int count = 1;
			this.initialiseCurrentNode();
			while (this.currentNode != null) {
				if ((count + 1) == position) {
					this.currentNode.setNextNode(this.currentNode.getNextNode().getNextNode());
					break;
				}
				this.currentNode = this.currentNode.getNextNode();
				count = count + 1;
			}
		}
	}

	public void printNodeValues() {
		if (this.head == null) {
			System.out.println("The Linked List is Empty!");
		} else {
			System.out.println("NODE VALUES :");
			this.initialiseCurrentNode();
			while (this.currentNode != null) {
				System.out.println(this.currentNode.getNodeValue());
				this.currentNode = this.currentNode.getNextNode();
			}
		}
		System.out.println("*******************************");
	}

	public int getLinkedListSize() {

		int count = 0;
		if (this.head == null) {
			return count;
		}
		this.initialiseCurrentNode();

		while (this.currentNode != null) {
			count += 1;
			this.currentNode = this.currentNode.getNextNode();
		}
		return count;
	}

}
