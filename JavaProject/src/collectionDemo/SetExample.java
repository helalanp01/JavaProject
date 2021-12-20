package collectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		hset();
		Tset();
		LHset();
		

	}
	public static Set<String> hset() {
		Set <String>names=new HashSet<>();
		names.add("Helal");
		names.add("Belal");
		names.add("Melal");
		names.add("Telal");
		names.add("Helal");
		names.add("Koral");
		names.add("");
		System.out.println(names);
		return names;
	}
	public static Set<String> Tset() {
		Set <String>names=new TreeSet<>();
		names.add("Helal");
		names.add("Belal");
		names.add("Melal");
		names.add("Telal");
		names.add("Helal");
		names.add("Koral");
		names.add("");
		System.out.println(names);
		return names;
	}
	public static Set<String> LHset() {
		Set <String>names=new LinkedHashSet<>();
		names.add("Koral");
		names.add("Helal");
		names.add("Belal");
		names.add("Melal");
		names.add("Telal");
		names.add("Helal");
		names.add("Koral");
		names.add("");
		System.out.println(names);
		return names;
	}

}
