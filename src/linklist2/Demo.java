package linklist2;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue<PrintJob> printq = new LinkedList<>();
			//add
			
			printq.add(new PrintJob("Document1.pdf"));
			printq.add(new PrintJob("Document2.pdf"));
			printq.add(new PrintJob("Document3.pdf"));
			printq.add(new PrintJob("Document4.pdf"));
			printq.add(new PrintJob("Document5.pdf"));
			
			
			System.out.println("printing jobs are" + printq );
			
			
			while(!printq.isEmpty()) {
				PrintJob currentprint = printq.poll();
				System.out.println("printing " + currentprint.getDocument());
			}
			

			System.out.println("print job is finisherd");
			System.out.println("printing jobs are" + printq );
			
	}
}
