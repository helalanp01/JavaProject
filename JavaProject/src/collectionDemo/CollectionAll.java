package collectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionAll {

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<>();
		list1.add("list");
		list1.add("Dup");
		list1.add("x");
		list1.add("Dup");
		System.out.println(list1);
		System.out.println(".............");
		List<String> list2 = new ArrayList<>();
		list2.add("list");
		list2.add("Dup");
		list2.add("x");
		list2.add("Dup");
		System.out.println(list2);
		System.out.println(".............");
		Set<String> set1=new HashSet<>();
		set1.add("set");
		set1.add("Dup");
		set1.add("x");
		set1.add("Dup");
		System.out.println(set1);
		System.out.println(".............");
		Set<String> set2=new TreeSet<>();
		set2.add("set");
		set2.add("Dup");
		set2.add("x");
		set2.add("Dup");
		System.out.println(set2);
		System.out.println(".............");
		Set<String>set3=new LinkedHashSet<>();
		set3.add("set");
		set3.add("Dup");
		set3.add("x");
		set3.add("Dup");
		System.out.println(set2);
		System.out.println(".............");
		Map<String,String>ml=new HashMap<>();
		ml.put("map","H");
		ml.put("dup","j");
		ml.put("x","M");
		ml.put("dup", "L");
		System.out.println(ml.keySet());
		System.out.println(ml.values());
		System.out.println(".............");
		
		SortedMap<String,String> m2=new TreeMap<>();
		m2.put("Map", "J");
		m2.put("dup", "K");
		m2.put("x", "M");
		m2.put("dup", "L");
		System.out.println(m2.keySet());
		System.out.println(m2.values());
		System.out.println(".............");
		
		LinkedHashMap<String, String>m3=new LinkedHashMap<>();
		m3.put("map", "J");
		m3.put("dup", "K");
		m3.put("x", "M");
		m3.put("dup", "L");
		System.out.println(m2.keySet());
		System.out.println(m2.values());
		System.out.println(".............");
	}

}
