package linklist1;

import java.util.LinkedList;
import java.util.Queue;

public class Programe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		
		//Adding elemet
		queue.add("Pargol");
		queue.add("Rich");
		queue.add("Daniel");
		queue.add("Osmary");
		queue.add("Erica");
		
		
		System.out.println(queue);
		
		//Removing elemets
		//String removedelem = queue.remove();
		//System.out.println("the element is removced " + removedelem);
		System.out.println(queue);
		//queue.remove();
		
		//Peek of Q
		String peekofQ = queue.peek();
		System.out.println("the peek elememnt is  " + peekofQ);
		
		//empty
		boolean isEmptyq = queue.isEmpty();
		System.out.println("is the q empty?  " + isEmptyq);
		
		//size of q
		int sizeofq = queue.size();
		System.out.println("the size is  " + sizeofq);
		
		
	}
}
