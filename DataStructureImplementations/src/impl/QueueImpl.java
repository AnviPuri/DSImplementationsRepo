package impl;

public class QueueImpl {

	private int[] queueArr;
	private static int FRONT = -1;
	private static int REAR = -1;
	private int size;

	public QueueImpl(int size) {
		this.size = size;
		queueArr = new int[size];
	}

	public void enque(int num) {
		if (FRONT == -1 && REAR == -1) {
			FRONT = 0;
			REAR = 0;
			queueArr[REAR] = num;
		} else if (REAR == size - 1) {
			System.out.println("QUEUE IS FULL!");
		} else {
			REAR = REAR + 1;
			queueArr[REAR] = num;
		}
	}

	public void deque() {
		if (FRONT == -1 && REAR == -1) {
			System.out.println("QUEUE IS EMPTY!");
		} else {
			FRONT += 1;
			if (FRONT == REAR) {
				FRONT = -1;
				REAR = -1;
			}
		}
	}

	public void peek() {
		if (FRONT == -1 && REAR == -1) {
			System.out.println("QUEUE IS EMPTY!");
		} else {
			System.out.println("ELEMENT ON TOP IS " + queueArr[FRONT]);
		}
	}

	public void printQueue() {
		if (FRONT == -1 && REAR == -1) {
			System.out.println("QUEUE IS EMPTY!");
		} else {
			System.out.println("PRINTING QUEUE!");
			for (int i = FRONT; i <= REAR; i++) {
				System.out.println(queueArr[i]);
			}
		}
	}

}
