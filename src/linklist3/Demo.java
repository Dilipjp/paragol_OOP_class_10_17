package linklist3;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueTest q = new QueueTest(4);
		
		q.displayq();
		q.addingQ(10);
		q.addingQ(20);
		q.addingQ(30);
		q.addingQ(40);
		q.addingQ(10);
		q.displayq();
		System.out.println();
		System.out.println("============");
		q.deletque();
		q.deletque();
		q.displayq();
		System.out.println();
		System.out.println("============");
		q.peekq();
		
	}
}
