package homeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraListHomeWork {

	public static void main(String[] args) {
		
		//Homework: 
			//Create a list of 10 employees(names & id) by using ArrayList 
		//and LinkList and 
		//implements all of the methods
		List<String>names=new ArrayList<>();
		names.add("Mamun bhai");
		names.add("Lovely Apu");
		names.add("Jaki Bhai");
		names.add("Morium Apu");
		names.add("Mahbub bhai");
		names.add("Helal Bhai");
		names.add("Shakil bhai");
		names.add("Fahiun Mama");
		names.add("Nazmul bhai");
		names.add("Mamun bhai");
		System.out.println(names);
		System.out.println("............");
		 int numberofnames=names.size();
		 System.out.println(numberofnames);
		System.out.println("............");
		for( String x:names) {
			System.out.println(x);

		}
		names.remove(5);
		names.add(2, "..");
		System.out.println(names);
		String ans=names.get(0);
		System.out.println(ans);
		boolean con=names.contains(names);
		System.out.println(con);
		List<Integer>id=new ArrayList<>();
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		id.add(5);
		id.add(6);
		id.add(7);
		id.add(8);
		id.add(9);
		id.add(10);
		System.out.println(id);
		System.out.println("............");
		
		System.out.println(id.size());
		System.out.println("............");
		for( int y:id) {
			System.out.println(y);

		}
		id.remove(5);
		id.remove(8);
		System.out.println(id);
		System.out.println(id.size());
		id.clear();
		System.out.println(id);
		boolean result=id.isEmpty();
		System.out.println(result);
		
		List<String>linknames=new LinkedList<>();
		linknames.add("Collection");
		linknames.add("List");
		linknames.add("Set");
		linknames.add("map");
		System.out.println(linknames);
		System.out.println(".......");
		int size=linknames.size();
		System.out.println(size);
		System.out.println(".......");
		String res=linknames.get(3);
		System.out.println(res);
		System.out.println(".......");
		boolean feedback=linknames.isEmpty();
		System.out.println(feedback);
		System.out.println(".......");
		linknames.clear();
		System.out.println(linknames);
		System.out.println(".......");
		boolean conofnames=linknames.contains("Array");
		System.out.println(conofnames);
		System.out.println(".......");
		linknames.add("hello");
		linknames.remove(0);
		System.out.println(linknames);
		System.out.println(".......");
		

	

	}
	
}
