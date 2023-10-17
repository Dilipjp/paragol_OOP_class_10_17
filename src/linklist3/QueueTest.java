package linklist3;

public class QueueTest {

	static private int queue[];
	static private int front,rear,capacity;
	
	public QueueTest(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	//inserting element in q
	static void addingQ(int data) {
		if(capacity == rear) {
			System.out.println("queue is full");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}
	
	//removing elemets from q
	static void deletque() {
		if(front==rear) {
			System.out.println("queue is empty");
			return;
		}
		//shiftifting
		else {
			for(int i = 0 ; i < rear-1;i++) {
				queue[i]  = queue[i+1]; 
			}
		
			if(rear < capacity) {
				queue[rear]  = 0 ;
				
			}
			rear--;
			
		}
		return;
	}
	
	static void displayq() {
		if(front==rear) {
			System.out.println("queue is empty");
			return;
		}
		
		for(int i = front; i <rear;i++) {
			System.out.printf("%d <---",queue[i]);
		}
		return;
	}
	
	
	static void peekq() {
		if(front==rear) {
			System.out.println("queue is empty");
			return;
		}
		System.out.println("fron is " + queue[front]);
	}
	

}
