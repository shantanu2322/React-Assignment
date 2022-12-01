package com.yash.Collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ascendingorder {

	public static void main(String[] args) {
		String a[] = new String[] { "b", "c", "e", "d", "a" };
		List<String> list = Arrays.asList(a);
		Collections.sort(list);
		System.out.println("Elements in ascending order:" + list);
	}
}
