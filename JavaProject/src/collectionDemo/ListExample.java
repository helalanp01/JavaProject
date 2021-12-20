package collectionDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		List<String>nameList=new LinkedList<>();
		
		nameList.add("Tom");
		nameList.add("Diana");
		nameList.add("Romeo");
		ListIterator<String>iter=nameList.listIterator();
		if(iter.hasNext())
		{
			String s=iter.next();
			System.out.println(s);
		 boolean st=iter.hasPrevious();
		 System.out.println(st);
		}
		
		
		System.out.println(nameList);
		nameList.remove("Harry");
		System.out.println(nameList);
		nameList.add("Tom");
		System.out.println(nameList);
		
		linkedDemo();

	}
	public static void linkedDemo() {
		LinkedList<String>names=new LinkedList<>();
		names.addLast("Laptop");
		names.addFirst("Helal");
		names.add("keyboard");
		//names.addLast("Mouse");
		System.out.println(names);
		System.out.println(names.getFirst());
		String removed=names.removeFirst();
		System.out.println(removed);
		
		
	}

}
