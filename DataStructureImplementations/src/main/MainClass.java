package main;

import impl.CircularQueueImpl;
import impl.DoubleLinkedListImpl;
import impl.QueueImpl;
import impl.SingleLinkedListImpl;
import impl.StackImpl;

public class MainClass {

	public static void main(String args[]) {

		System.out.println("DOUBLE LINKED LIST IMPLEMENTATION-------------------");
		DoubleLinkedListImpl dlli = new DoubleLinkedListImpl();
		dlli.insertNodeAtBeginning(1);
		dlli.insertNodeAtEnd(2);
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();
		dlli.insertNodeAtBeginning(0);
		dlli.insertNodeAtEnd(3);
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();
		dlli.deleteNodeFromEnd();
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();
		dlli.deleteNodeFromBeginning();
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();
		dlli.insertNodeAtNthPositionFromBeginning(5, 5);
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();
		dlli.insertNodeAtNthPositionFromBeginning(4, 3);
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();
		dlli.insertNodeAtNthPositionFromBeginning(3, 3);
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();
		dlli.deleteNodeFromNthPositionFromBeginning(10);
		dlli.deleteNodeFromNthPositionFromBeginning(2);
		dlli.printNodeFromBeginning();
		dlli.printNodeFromEnd();

		System.out.println("SINGLE LINKED LIST IMPLEMENTATION-------------------");
		SingleLinkedListImpl slli = new SingleLinkedListImpl();
		slli.printNodeValues();
		slli.insertNodeAtEnd(3);
		slli.insertNodeAtEnd(5);
		slli.printNodeValues();
		slli.deleteNodeFromBeginning();
		slli.insertNodeAtBeginning(4);
		slli.insertNodeAtBeginning(2);
		slli.printNodeValues();
		slli.deleteNodeFromEnd();
		slli.printNodeValues();
		slli.deleteNodeFromEnd();
		slli.printNodeValues();
		slli.deleteNodeFromEnd();
		slli.printNodeValues();
		slli.insertNodeAtBeginning(4);
		slli.insertNodeAtNthPosition(5, 5);
		slli.insertNodeAtNthPosition(5, 2);
		slli.insertNodeAtNthPosition(3, 1);
		slli.printNodeValues();
		slli.insertNodeAtNthPosition(7, 4);
		slli.printNodeValues();
		slli.insertNodeAtNthPosition(6, 4);
		slli.printNodeValues();
		slli.deleteFromNthPosition(10);
		slli.deleteFromNthPosition(3);
		slli.printNodeValues();

		System.out.println("STACK IMPLEMENTATION");
		StackImpl stackImpl = new StackImpl(3);
		stackImpl.pop();
		stackImpl.push(90);
		stackImpl.push(100);
		stackImpl.printStack();
		stackImpl.pop();
		stackImpl.push(10);
		stackImpl.push(100);
		stackImpl.push(50);
		stackImpl.push(40);
		stackImpl.push(30);
		stackImpl.printStack();
		stackImpl.pop();
		stackImpl.printStack();
		stackImpl.peek();

		System.out.println("QUEUE IMPLEMENTATION");
		QueueImpl queueImpl = new QueueImpl(5);
		queueImpl.peek();
		queueImpl.deque();
		queueImpl.enque(1);
		queueImpl.enque(2);
		queueImpl.enque(3);
		queueImpl.printQueue();
		queueImpl.deque();
		queueImpl.printQueue();
		queueImpl.enque(4);
		queueImpl.enque(5);
		queueImpl.enque(6);
		queueImpl.printQueue();
		queueImpl.deque();
		queueImpl.peek();
		queueImpl.printQueue();

		System.out.println("CIRCULAR QUEUE IMPLEMENTATION");
		CircularQueueImpl circularQueueImpl = new CircularQueueImpl(5);
		circularQueueImpl.peek();
		circularQueueImpl.deque();
		circularQueueImpl.enque(1);
		circularQueueImpl.enque(2);
		circularQueueImpl.enque(3);
		circularQueueImpl.printQueue();
		circularQueueImpl.deque();
		circularQueueImpl.printQueue();
		circularQueueImpl.enque(4);
		circularQueueImpl.enque(5);
		circularQueueImpl.enque(6);
		circularQueueImpl.printQueue();
		circularQueueImpl.deque();
		circularQueueImpl.peek();
		circularQueueImpl.printQueue();

	}
}
