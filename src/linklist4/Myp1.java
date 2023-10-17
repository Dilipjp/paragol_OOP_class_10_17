package linklist4;

import java.util.LinkedList;

public class Myp1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		names.add("pargol");
		names.add("Daniel");
		names.add("Rich");
		names.addFirst("Erica");
		names.addFirst("Erica");
		names.addFirst("Erica");
		names.add("Osmary");
		names.add("Daniel");
		names.add("Rich");
		names.add("Osmary");
		names.addFirst("Erica");
		
		
		names.remove();
		names.remove();
		
		System.out.print(names);
		System.out.println("++++++++++++");
		names.removeLast();
		System.out.print(names);
	}

}
