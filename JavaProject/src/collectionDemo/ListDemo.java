package collectionDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		LinkedList<String>staff=new LinkedList<>();
		staff.addLast("Tom");
		staff.addLast("Diana");
		staff.addLast("Harry");
		staff.addLast("Romeo");
		
		
		ListIterator <String>iterator=staff.listIterator();
		iterator.next();
		iterator.next();
		iterator.remove();
		iterator.add("Julia");
		iterator.add("Wina");
		//iterator.next();
		/*for(String name:staff) {
			System.out.println(name);
		}*/
		while(iterator.hasNext()) {
			iterator.next();
			//System.out.println(staff);
		}
		
		
		System.out.println(staff);

	}

}
