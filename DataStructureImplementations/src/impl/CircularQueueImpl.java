package impl;

public class CircularQueueImpl {

	private int[] queueArr;
	private int size;
	private static int FRONT = -1;
	private static int REAR = -1;

	public CircularQueueImpl(int size) {
		this.size = size;
		queueArr = new int[size];
	}

	public void enque(int num) {
		if (this.isQueueFull()) {
			System.out.println("QUEUE IS FULL!");
		} else {
			if (REAR == -1 && FRONT == -1) {
				REAR = 0;
				FRONT = 0;
				queueArr[REAR] = num;
			} else if (REAR == (size - 1)) {
				REAR = 0;
				queueArr[REAR] = num;
			} else {
				REAR = REAR + 1;
				queueArr[REAR] = num;
			}
		}
	}

	public void deque() {
		if (this.isQueueEmpty()) {
			System.out.println("QUEUE IS EMPTY!");
		} else if (FRONT == REAR && FRONT != -1) {
			FRONT = -1;
			REAR = -1;
		} else {
			FRONT = FRONT + 1;
		}
	}

	public void peek() {
		if (this.isQueueEmpty()) {
			System.out.println("QUEUE IS EMPTY!");
		} else {
			System.out.println("ELEMENT ON TOP IS " + queueArr[FRONT]);
		}
	}

	public void printQueue() {
		if (this.isQueueEmpty()) {
			System.out.println("QUEUE IS EMPTY!");
		} else if (REAR > FRONT) {
			for (int i = FRONT; i <= REAR; i++) {
				System.out.println(queueArr[i]);
			}
		} else {
			for (int i = FRONT; i <= (size - 1); i++) {
				System.out.println(queueArr[i]);
			}
			for (int i = 0; i <= REAR; i++) {
				System.out.println(queueArr[i]);
			}
		}
	}

	private boolean isQueueEmpty() {
		if (FRONT == -1 && REAR == -1)
			return true;
		return false;
	}

	private boolean isQueueFull() {
		if (FRONT == 0 && REAR == (size - 1))
			return true;
		if (FRONT == (REAR + 1))
			return true;
		return false;
	}

}
