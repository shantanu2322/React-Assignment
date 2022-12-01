package com.yash.Collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(80);
		list.add(70);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(80);

		Set<Integer> set = new HashSet<>(list);

		
		ArrayList<Integer> list2 = new ArrayList<Integer>(set);

		Collections.sort(list2);

		System.out.println(list2);

	}
}
