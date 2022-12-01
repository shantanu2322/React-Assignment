package com.yash.Collection2;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(5);
		ar.add(10);
		ar.add(15);
		ar.add(20);
		ar.add(25);
		ar.add(30);
		ar.add(35);

		int value = 15;
		int res = Collections.binarySearch(ar, value);
		System.out.println(res);
	}

}
