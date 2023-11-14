package sample;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeSet {

	public static void main(String[] args) {
		Set<String> treeSet = new java.util.TreeSet<String>();
		treeSet.add("A");
		treeSet.add("D");
		treeSet.add("B");
//		System.out.println(treeSet);

		Map<String, String> map = new TreeMap<String, String>();
		map.put("Key1", "Value1");
		map.put("Key2", "Value2");
		map.put("Key3", "Value3");
		map.put("Key4", "Value4");
		System.out.println("Tree Map: " + map);
		System.out.println("Key 1 value is: " + map.get("Key1"));

	}
}
