package com.yash.Collection6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortbyCity {

	static Map<String, Integer> map = new HashMap<>();

	public static void sortbykey() {

		TreeMap<String, Integer> sorted = new TreeMap<>();

		sorted.putAll(map);

		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	public static void main(String args[]) {

		map.put("Pune", 5000);
		map.put("Mumbai", 4000);
		map.put("Jalna", 8000);
		map.put("Nagpur", 3000);
		map.put("Amravati", 9000);

		sortbykey();

	}
}
