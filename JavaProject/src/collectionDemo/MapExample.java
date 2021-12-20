package collectionDemo;

import java.awt.Color;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		//do not need sorted order use HashMap
		Map<String,Integer>Scores=new HashMap<>();
		Scores.put("Sachin", 90);
		Scores.put("Sakib", 95);
		Scores.put("Tamim", 100);
		System.out.println(Scores);
		System.out.println("........");
		Map<String,Integer>Score=new TreeMap<>();
		Score.put("Sachin", 90);
		Score.put("sakib", 95);
		Score.put("Tamim", 80);
		Score.put("Sakib", 105);
		System.out.println(Score);
		int n=Score.get("Tamim");
		System.out.println(n);
		Integer n2=Score.get("Helal");
		System.out.println(n2);
		System.out.println(Score.toString());
		for(String key:Score.keySet()) {
			Integer value=Score.get(key);
			System.out.println(value);
			
		}
		Set<String>keySet=Score.keySet();
		System.out.println(keySet);
		for(String key:keySet) {
			Integer value=Score.get(key);
			System.out.println(key+"->"+value);
		}

	}

}
